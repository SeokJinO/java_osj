package day19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Ex02_Board {
	static Scanner sc = new Scanner(System.in);
	static List<Board> list = new ArrayList<Board>();

	public static void main(String[] args) {
		int exitMenu = 4;
		int menu = -1;

		while (menu != exitMenu) {
			try {
				printMenu();
				menu = sc.nextInt();
				boardSystem(menu);

			} catch (Exception e) {
				System.out.println("옳지 않은 입력입니다.");
				sc.nextLine();
			}
		}

	}

	public static void printMenu() {
		System.out.println("1. 게시글 작성");
		System.out.println("2. 게시글 확인");
		System.out.println("3. 게시글 수정");
		System.out.println("4. 프로그램 종료");
	}

	public static void boardSystem(int menu) {
		switch (menu) {
		case 1:
			Board board = inputBoard();
			insertBoard(board);
			break;
		case 2:
			printBoard();
			if (list.size() > 0) {
				System.out.print("상세 정보를 확인하시겠습니까? (true / false) : ");
				boolean b = sc.nextBoolean();
				if (b == true) {
					System.out.print("게시물을 선택해주세요 : ");
					int num = sc.nextInt();
					detailPrintBoard(num - 1);

					int viewCount = list.get(num - 1).getView();
					viewCount++;
					list.get(num - 1).modify(viewCount);
				}
			}
			break;
		case 3:
			printBoard();
			if (list.size() < 0) {
				System.out.println("수정할 게시글의 NUM을 입력해 주세요.");
				int num = sc.nextInt();
				System.out.println("제목을 입력하세요.");
				String str = sc.next();
				System.out.println("내용을 입력하세요.");
				String content = sc.next();

				list.get(num - 1).modify(str, content);
			}
			break;
		case 4:
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
	}

	public static Board inputBoard() {
		System.out.print("타입 : ");
		String type = sc.next();
		System.out.print("제목 : ");
		String title = sc.next();
		System.out.println("내용 : ");
		String content = sc.next();
		System.out.println("작성자 : ");
		String writer = sc.next();
		return new Board(type, title, content, writer);
	}

	public static void insertBoard(Board board) {
		if (board == null) {
			return;
		}
		if (list.contains(board)) {
			System.out.println("이미 등록된 게시물입니다.");
			return;
		}
		list.add(board);
		list.sort(new Comparator<Board>() {

			@Override
			public int compare(Board o1, Board o2) {

				if (o1.getType().compareTo(o2.getType()) != 0) {
					return o1.getType().compareTo(o2.getType());
				}
				if (o1.getNum() != o2.getNum()) {
					return o1.getNum() - o2.getNum();
				}
				return 0;
			}

		});

	}

	public static void printBoard() {
		if (list.size() == 0) {
			System.out.println("저장된 게시글 정보가 없습니다.");
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			list.get(i).Print();
		}

	}

	public static void detailPrintBoard(int num) {
		list.get(num).detailPrint();
	}

}

/* 반복 : 종료 메뉴를 선택할 때까지 
   콘솔창에 메뉴 출력
   실행할 메뉴를 콘솔에서 입력 받음
   입력받은 메뉴에 맞는 기능을 실행
  
   1번 메뉴를 선택 : 게시글 등록 기능을 실행
   타입 입력
   제목 입력
   내용 입력
   작성자 입력
   게시글 생성 후 저장
   
   2번 메뉴를 선택 : 게시글 확인 기능을 실행
   전체 게시글 확인
   게시글 선택
   게시글 상세 확인
   
   3번메뉴를 선택 : 게시글 수정 기능을 실행
   전체 게시글 확인
   게시글 선택
   게시글 제목 입력
   게시글 내용 입력*/
