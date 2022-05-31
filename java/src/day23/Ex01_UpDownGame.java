package day23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01_UpDownGame {
	public static Scanner sc = new Scanner(System.in);
	public static List<UpDown> list = new ArrayList<UpDown>();

	public static void main(String[] args) {
		/* - 1~100사이의 랜덤한 수를 맞추는 Up Down 게임 프로그램의 코드를 작성하세요
		 * - 기록을 저장하는 기능을 추가
		 * - 기록은 최대 5등까지
		 * - 5등 이내의 기록은 이름을 기록하여 저장
		 * 
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료*/

		int exitMenu = 3;
		int menu = -1;
		do {
			printMenu();
			menu = sc.nextInt();
			selectMenu(menu);

		} while (menu != exitMenu);
	}

	private static void selectMenu(int menu) {
		switch (menu) {
		case 1:
			playUpDown();
			break;
		case 2:
			printUser();
			break;
		case 3:
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}

	}

	private static void printUser() {

		list.sort((UpDown s1, UpDown s2) -> {
			if (s1.getCount() != s2.getCount())
				return s1.getCount() - s2.getCount();
			return 0;
		});
		if(list.size()>5) {
			list.remove(5);
		}
		for (UpDown tmp : list) {
			System.out.println(tmp);
		}
		

	}

	private static void playUpDown() {
		//1~100사이의 랜덤한 수 생성
		int r = (int) (Math.random() * (100 - 1 + 1) + 1);
		int count = 1;
		System.out.print("1~100사이의 숫자를 입력하세요 : ");
		int num = -1;
		while (num != r) {
			num = sc.nextInt();
			if (num == r) {
				System.out.println("정답입니다");
				break;
			} else if (num > r) {
				System.out.println("DOWN");
			} else {
				System.out.println("UP");
			}
			count++;
		}
		System.out.print("플레이어 이름을 입력해주세요 : ");
		String name = sc.next();
		UpDown ud = new UpDown(name, count);
		list.add(ud);

	}

	private static void printMenu() {
		System.out.println("1. 플레이");
		System.out.println("2. 기록확인");
		System.out.println("3. 종료");
		System.out.print("메뉴를 선택해 주세요 : ");

	}

}
