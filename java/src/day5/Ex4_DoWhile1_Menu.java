package day5;

import java.util.Scanner;

public class Ex4_DoWhile1_Menu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int menu;
		do {
			System.out.println("1. 학생정보입력\n"
				+ "2. 학생정보출력\n"
				+ "3. 학생정보수정\n"
				+ "4. 학생정보삭제\n"
				+ "5. 프로그램 종료\n"
				+ "메뉴를 선택하세요 : ");
			menu = sc.nextInt();
		}while(menu!=5);
			sc.close();
				
	}

}

