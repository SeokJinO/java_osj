package day3;

import java.util.Scanner;

public class Ex4_if1 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 A를 입력하시오.");
		int num1 = sc.nextInt();
		System.out.println("산술 연산자를 입력하시오.");
		char ch = sc.next().charAt(0);
		System.out.println("정수 B를 입력하시오.");
		int num2 = sc.nextInt();
		
		
		if(ch=='+') {
			System.out.println(num1 + num2);
		}else if(ch=='-') {
			System.out.println(num1 - num2);
		}else if(ch=='*') {
			System.out.println(num1*num2);
		}else if(ch=='/') {
			System.out.println((double)num1/num2);
		}else if(ch=='%') {
			System.out.println(num1%num2);
		}else {
			System.out.println("잘못된 연산자입니다.");
		}
	}

}
