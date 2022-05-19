package day14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BaseballGame implements ConsoleProgram {

	private final int exitMenu = 3;
	private Scanner sc = new Scanner(System.in);
	private List<Integer> com = new ArrayList<Integer>();
	private List<Integer> user = new ArrayList<Integer>();
	private List<Integer> records = new ArrayList<Integer>();
	private int min = 1;
	private int max = 9;

	@Override
	public int selectMenu(Scanner sc) {
		System.out.println("========메뉴========");
		System.out.println("1. 플레이");
		System.out.println("2. 기록 확인");
		System.out.println("3. 프로그램 종료");
		System.out.println("===================");
		System.out.println("메뉴 선택 : ");
		int menu = sc.nextInt();

		return menu;
	}

	@Override
	public void excute(int menu) {
		switch (menu) {
		case 1:
			//컴퓨터 랜덤 수 생성
			com.clear();
			createComRandom();
			System.out.println();
			int count = 0;
			while (true) {
				user.clear();
				inputNumbers(3);
				//스트라이크, 볼 개수 확인
				int strike = 0;
				for (int i = 0; i < com.size(); i++) {
					if (com.get(i).equals(user.get(i))) {
						strike++;
					}
				}
				int ball = 0;
				for (Integer tmp : com) {
					if (user.contains(tmp)) {
						ball++;
					}
				}
				ball = ball - strike;
				if (strike != 0) {
					System.out.print(strike + "S");
				}
				if (ball != 0) {
					System.out.print(ball + "B");
				}
				if(strike == 0 && ball == 0) {
					System.out.println("OUT");
				}
				System.out.println();
				//횟수 1증가
				count++;
				if(strike==3) {
					break;
				}
			}
			System.out.println(count+"번째 성공");
			//기록 저장
			records.add(count);
			records.sort(new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					return o1 - o2;
				}
			});
			if(records.size() > 5) {
				records.remove(5);
			}
			break;
		case 2:
			System.out.println(records);
			break;
		case 3:
			break;
		default:
			System.out.println("잘못된 메뉴를 선택했습니다.");
			System.out.println("====================");
		}
	}

	@Override
	public void run() {
		int menu;

		do {
			menu = selectMenu(sc);
			excute(menu);
		} while (menu != exitMenu);
		System.out.println("게임을 종료합니다.");
	}

	public BaseballGame(Scanner sc) {
		this.sc = sc;
	}

	public void createComRandom() {
		while (com.size() < 3) {
			//랜덤 수 생성
			int r = random(min, max);
			//중복 체크 => 중복되지 않으면 저장
			if (com.indexOf(r) == -1) {
				com.add(r);
				System.out.print(r + " ");
			}
		}
	}

	public int play() {
		int count = 0;
		for (int i = 0; i < com.size(); i++) {
			user.add(sc.nextInt());
		}
		for (int i = 0; i < com.size(); i++) {
			if (com.get(i) == user.get(i)) {
				count++;
			}
		}
		return count;

	}
	public void inputNumbers(int count) {
		System.out.println("중복되지 않게 1~9사이의 3개의 숫자를 입력하세요.");
		System.out.print("입력 (예 : 1 2 3) : ");
		while (user.size() < 3) {
			user.add(sc.nextInt());
		}
	}

}
