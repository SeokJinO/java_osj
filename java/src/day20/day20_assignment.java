package day20;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class day20_assignment {
	public static Scanner sc = new Scanner(System.in);
	public static List<String> list = new ArrayList<String>();

	public static void main(String[] args) {

		int exitMenu = 4;
		int menu = -1;

		do {
			try {
				printMenu();
				menu = sc.nextInt();
				selectMenu(menu);
			} catch (InputMismatchException e) {
				System.out.println("잘못된 메뉴입니다.");
				sc.next();
			}
		} while (menu != exitMenu);

		System.out.println("프로그램을 종료합니다.");
	}

	public static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 파일 저장");
		System.out.println("2. 파일 확인");
		System.out.println("3. 파일 검색");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴를 선택하세요 : ");

	}

	public static void selectMenu(int menu) {
		try {
			switch (menu) {

			case 1:
				insertFile();
				break;
			case 2:
				printFile();
				break;
			case 3:
				searchFile();
				break;
			case 4:
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		} catch (InputMismatchException e) {
			System.out.println("잘못된 메뉴입니다.");
		}
	}

	public static void insertFile() {
		System.out.print("파일명 : ");
		String name = sc.next();
		list.add(name);
		System.out.println("파일 저장이 완료되었습니다.");
	}

	public static void printFile() {
		for (String tmp : list) {
			System.out.println(tmp);
		}
	}

	public static void searchFile() {
		System.out.print("검색어 : ");
		String search = sc.next();
		int count = 0;
		for (String tmp : list) {
			if(tmp.contains(search)) {
					System.out.println(tmp);
					count ++;
			}
		}
		if(count == 0) {
			System.out.println("해당 검색어를 포함한 파일은 없습니다.");
		}
	}
}
