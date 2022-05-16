package assignment;

import java.util.Scanner;

import day14.AccountBook;
import day14.ConsoleProgram;
import day14.Item;

public class PostManager implements ConsoleProgram {

	private Scanner sc;
	private Post pp;
	private final int exitMenu = 4;

	public PostManager(Scanner sc) {
		this.sc = sc;
		pp = new Post();
		Content content = new Content("안녕하세요", "감사합니다");
		pp.insertContent(content);
	}

	@Override
	public int selectMenu(Scanner sc) {
		System.out.println("=======메뉴=======");
		System.out.println("1. 게시물 확인");
		System.out.println("2. 게시물 추가");
		System.out.println("3. 게시물 수정");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int menu = sc.nextInt();
		System.out.println("=================");
		return menu;
	}

	@Override
	public void excute(int menu) {
		switch (menu) {
		case 1:
			System.out.println("게시물을 확인합니다 (1. 공지 / 2. 일반) : ");
			int num = sc.nextInt();
			if(num == 1) {
				
			}
			readPost();

			break;
		case 2:
			if (insertPost()) {
				System.out.println("게시물을 추가했습니다.");
			} else {
				System.out.println("게시물 추가에 실패하였습니다.");
			}
			System.out.println("=================");
			break;
		case 3:

			if (modifyPost()) {
				System.out.println("수정에 성공하였습니다.");
			} else {
				System.out.println("수정에 실패하였습니다.");
			}
			System.out.println("=================");
			break;
		case 4:
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
			System.out.println("==================");
		}
	}

	public void readPost() {
		pp.readContents();
		System.out.println("===============");
	}

	public boolean insertPost() {
		System.out.println("제목 : ");
		String title = sc.next();
		System.out.println("내용 : ");
		String detail = sc.next();
		Content content = new Content(title, detail);
		return pp.insertContent(content);
	}

	public boolean modifyPost() {
		pp.readContents();
		System.out.println("수정할 항목 : ");
		int modIndex = sc.nextInt();
		pp.readContent(modIndex);
		System.out.println("선택한 항목내역은 위 내역입니다. 수정하시겠습니까? (true / false) ");
		boolean ans = sc.nextBoolean();
		if (!ans) {
			return false;
		}
		System.out.println("제목을 수정하겠습니까? (true/false) : ");
		boolean ok = sc.nextBoolean();
		String title2 = null;
		if (ok) {
			System.out.println("제목 : ");
			title2 = sc.next();
		}
		System.out.println("내용을 수정하겠습니까? (true/false) : ");
		ok = sc.nextBoolean();
		String detail2 = null;
		if (ok) {
			System.out.println("내용 : ");
			detail2 = sc.next();
		}
		return pp.modifyContent(modIndex - 1, title2, detail2);
	}

	@Override
	public void run() {
		int menu;
		do {
			menu = selectMenu(sc);
			excute(menu);
		} while (menu != exitMenu);
		System.out.println("게시물 프로그램이 종료되었습니다.");
		System.out.println("=================");

	}
}
