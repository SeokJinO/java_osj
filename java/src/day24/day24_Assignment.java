package day24;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class day24_Assignment {
	public static Scanner sc = new Scanner(System.in);
	public static List<Phone> list = new ArrayList<Phone>();

	public static void main(String[] args) {
		int exitMenu = 4;
		int menu = -1;
		do {
			try {
			printMenu();
			menu = sc.nextInt();
			numberSearch(menu);
			}catch(InputMismatchException e) {
				System.out.println("잘못된 입력입니다.");
				sc.next();
			}
		} while (exitMenu != menu);

	}

	public static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1.전화번호 추가");
		System.out.println("2.전화번호 확인");
		System.out.println("3.전화번호 검색");
		System.out.println("4.프로그램 종료");
		System.out.print("메뉴를 선택하세요 : ");
	}

	public static void numberSearch(int menu) {
		switch (menu) {
		case 1:
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			System.out.println("전화번호를 입력하세요 : ex)010-1234-1234");
			String number = sc.next();
			Phone phone = new Phone(name, number);
			if(list.contains(phone)) {
				System.out.println("이미 등록되어있는 전화번호입니다.");
			}else {
			list.add(phone);
			System.out.println("전화번호 추가에 성공하였습니다.");
			}
			break;
		case 2:
			printNumber();
			break;
		case 3:
			searchNumber();
			break;
		case 4:
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
	}
	public static void printNumber() {
		list.sort((Phone p1, Phone p2) -> {
			if (p1.getName() != p2.getName())
				return p1.getName().compareTo(p2.getName());
			return 0;
		});
		
		for(Phone tmp : list) {
			System.out.println(tmp);
		}
	}
	public static void searchNumber() {
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		int count = 0;
		for(Phone tmp : list) {
			if(tmp.getName().equals(name)) {
				System.out.println(tmp);
				count++;
			}
		}
		if(count == 0) {
			System.out.println("해당 전화번호는 저장되지 않은 전화번호입니다.");
		}
	}
}
