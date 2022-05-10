package day11;

import java.util.Scanner;

import day11.*;

public class Ex6_Program_Student {
	/*
	 * 학생 정보(이름, 학년, 반, 번호, 국어, 영어, 수학 성적)를 관리하는 프로그램을 작성하세요. 
	 * 1. 기능을 정리 => 주석 
	 * - 학생정보 입력 
	 * 	- 학년, 반, 번호, 이름, 국어, 영어, 수학 성적을 한번에 입력받음 
	 * -입력한 학생정보를 저장 
	 * - 학생정보 출력 
	 *  - 전체 학년, 반, 번호, 이름, 국어, 영어, 수학 성적을 출력 
	 * - 학생정보 수정 
	 * 	- 학년, 반, 번호를 입력받음 -입력받은 정보와 일치하는 학생이 있으면 이름, 국어, 영어, 수학 성적을 전부 수정 
	 * 	- 학생정보 삭제 
	 * 	-학년, 반, 번호를 입력받음 -입력받은 정보와 일치하는 학생이 있으면, 삭제 
	 * - 프로그램 종료 
	 * 2. 필요한 클래스가 있는지 확인하고, 있으면 만듦 
	 * - 학생 클래스 : 학년, 반, 번호, 이름, 국어, 영어, 수학 성적 
	 * - 기능 : 
	 * - 학생 정보를 출력 
	 * - 학년, 반, 번호가 주어졌을 때 일치하는지 확인하는 기능 
	 * - 이름, 국어, 영어, 수학을 수정하는 기능 
	 * - 생성자 : 이름, 학년, 반, 번호, 국어, 영어, 수학 성적이 주어졌을 때 초기화 하는 생성자 
	 * 3. 기능을 구현 
	 * - 클래스 정의 및 구현 
	 * - 반복문을 메뉴 출력 및 메뉴 선택
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = -1;
		final int max = 30;
		Ex6_Student std[] = new Ex6_Student[max];
		int count = 0;

		String student;
		int grade = 0, classNumber = 0, number = 0;
		double kor, eng, math;

		Ex6_Student st = new Ex6_Student("오석진", 1, 1, 1, 0, 0, 0);
		while (true) {
			choice = selectMenu(sc);
			if (choice == 1) {
				System.out.println("학생 정보 입력합니다.");
				System.out.print("이름 : ");
				student = sc.next();
				System.out.print("학년 : ");
				grade = sc.nextInt();
				System.out.print("반 : ");
				classNumber = sc.nextInt();
				System.out.print("번호 : ");
				number = sc.nextInt();
				System.out.print("국어 성적 : ");
				kor = sc.nextDouble();
				System.out.print("영어 성적 : ");
				eng = sc.nextDouble();
				System.out.print("수학 성적 : ");
				math = sc.nextDouble();
				st = new Ex6_Student(student, grade, classNumber, number, kor, eng, math);
				std[count] = st;
				count++;

			} else if (choice == 2) {
				System.out.println("학생 정보 출력합니다.");
				for (int i = 0; i < count; i++) {
					st = std[i];
					st.print();
				}
			} else if (choice == 3) {
				System.out.println("학생 정보 수정합니다. ");
				//학년, 반, 번호를 입력
				System.out.print("학년, 반, 번호 :");
				grade = sc.nextInt();
				classNumber = sc.nextInt();
				number = sc.nextInt();
				//반복문을 통해 0번지부터 count명 만큼 학생 정보를 하나씩 가져와서
				for (int i = 0; i < count; i++) {
					//입력받은 학년, 반, 번호와 일치하는 학생이 있는지 확인해서 있으면 
					if (std[i].sameInfor(grade, classNumber, number)) {
						//이름, 국어, 영어, 수학 성적을 입력 받은 후
						student = sc.next();
						kor = sc.nextDouble();
						eng = sc.nextDouble();
						math = sc.nextDouble();
						//학생 정보를 수정하고, 반복문을 종료
						std[i].changeScore(student, kor, eng, math);
						break;
					}
					//등록된 학생 전체를 확인해서 일치하는 학생이 없으면 등록된 학생이 아닙니다라고 출력
					if (i + 1 == count) {
						System.out.println("등록된 학생이 아닙니다.");
					}

				}

			} else if (choice == 4) {
				System.out.println("삭제할 학생의 학년 반 번호를 입력하세요.");
				grade = sc.nextInt();
				classNumber = sc.nextInt();
				number = sc.nextInt();
				int delIndex = -1;
				//반복문을 이용하여 0번지부터 index명의 학생을 비교하여 일치하는 학생 정보가 있으면 delIndex번지인지 기억하고 반복문을 종료

				

				//delIndex가 0 이상이면 index를 1 감소
				//delIndex가 0 미만이면 등록된 학생이 아닙니다를 출력

				for (int i = 0; i < count; i++) {
					if (std[i].sameInfor(grade, classNumber, number)) {
						delIndex = i;
						break;
					}
				}
				//delInexr가 0 이상이면 반복문을 이용하여 delIndex번지부터 index-2번지까지 다음번지에 있는 정보를 현재 번지에 저장
				if(delIndex >= 0) {
					for(int i = delIndex; i < count-1; i++) {
						std[i] = std[i+1]; 
					}
					count--;
				}else {
					System.out.println("삭제할 학생이 없습니다.");
				}
			} else if (choice == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

	/*
	 * 기능 : 메뉴를 출력하고 메뉴를 입력하면 입력한 메뉴를 돌려주는 메소드 매개변수 : 입력받기 위한 Scanner => Scanner sc
	 * 리턴타입 : 입력한 메뉴 => 정수 => int 메소드명 : selectMenu
	 */
	public static int selectMenu(Scanner sc) {
		System.out.println("----------메뉴---------");
		System.out.println("1.학생 정보 입력");
		System.out.println("2.학생 정보 출력");
		System.out.println("3.학생 정보 수정");
		System.out.println("4.학생 정보 삭제");
		System.out.println("5.프로그램 종료");
		int choice = sc.nextInt();
		System.out.println("------------------------");
		return choice;
	}
}
