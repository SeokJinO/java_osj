package day6;

import java.util.Scanner;

public class Ex1_Calculator {

	public static void main(String[] args) {
		/* 문자를 입력받아 입력받은 문자를 출력하는 코드를 작성하세요.
		 * 단 , q가 입력될 때 까지 입력을 계속적으로 받습니다. */
		 
		Scanner sc = new Scanner(System.in);

		
		while(true) {
			System.out.println("산술 연산자 메뉴");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("5. 나머지");
			System.out.println("q. 종료");
			System.out.println("메뉴를 선택하세요 : ");
			
			System.out.println("정수 두개를 입력하세요.");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			char ch = sc.next().charAt(0);
			if(ch=='1') {
				System.out.println(num1 + num2);
			}else if(ch=='2') {
				System.out.println(num1 - num2);
			}else if(ch=='3') {
				System.out.println(num1*num2);
			}else if(ch=='4') {
				System.out.println((double)num1/num2);
			}else if(ch=='5') {
				System.out.println(num1%num2);
			}else if(ch=='q') {
				break;
			}
			else {
				System.out.println("잘못된 연산자입니다.");
		}
	}

}
}
