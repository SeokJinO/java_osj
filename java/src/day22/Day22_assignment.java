package day22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day22_assignment {
	public static Scanner sc = new Scanner(System.in);
	public static Day22_assignment_1 day = new Day22_assignment_1(0, 0, 0);
	public static List<Day22_assignment_1> list = new ArrayList<Day22_assignment_1>();
	public static String name = "홍길동";
	public static void main(String[] args) {
		/* 학생 1명의 성적을 관리하는 프로그램을 작성하세요.
			1. 성적 추가
			2. 성적 확인
			3. 성적 수정
			4. 프로그램 종료*/
		
		

		int menu = -1;
		int exitMenu = 4;
		do {
			try {
			printMenu();
			menu = sc.nextInt();
			selectMenu(menu);
			}catch(Exception e) {
				System.out.println("잘못된 메뉴입니다.");
				sc.next();
			}
		} while (menu != exitMenu);
	}

	public static void printMenu() {
		System.out.println("1. 성적 추가");
		System.out.println("2. 성적 확인");
		System.out.println("3. 성적 수정");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴를 선택하세요 : ");
	}

	public static void selectMenu(int menu) {
		switch (menu) {
		case 1: System.out.print("국어성적을 입력하세요 : ");
				int kor = sc.nextInt();
				System.out.print("영어 성적을 입력하세요 : ");
				int eng = sc.nextInt();
				System.out.print("수학 성적을 입력하세요 : ");
				int math = sc.nextInt();
				Day22_assignment_1 day = new Day22_assignment_1(kor, eng, math);
				list.add(day);
				System.out.println("성적 추가가 완료되었습니다.");
			break;
		case 2:
			for(Day22_assignment_1 tmp : list) {
				System.out.println(name + "의 성적은" + tmp);
			}
			break;
		case 3:
			System.out.print("수정할 과목을 입력하세요 : ");
			String sub = sc.next();
			if(sub.equals("국어")) {
				System.out.print("현재 국어의 성적은 "+ list.get(0).kor +"입니다. 수정할 점수를 입력하세요."  );
				int modkor = sc.nextInt();
				list.get(0).setKor(modkor);
				System.out.println("수정이 완료되었습니다.");
			}else if(sub.equals("영어")){
				System.out.print("현재 영어의 성적은 "+ list.get(0).eng +"입니다. 수정할 점수를 입력하세요."  );
				int modeng = sc.nextInt();
				list.get(0).setEng(modeng);
				System.out.println("수정이 완료되었습니다.");
			}else if(sub.equals("수학")) {
				System.out.print("현재 수학의 성적은 "+ list.get(0).math +"입니다. 수정할 점수를 입력하세요."  );
				int modmath = sc.nextInt();
				list.get(0).setMath(modmath);
				System.out.println("수정이 완료되었습니다.");
			}
			break;
		case 4:
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
	}
}
