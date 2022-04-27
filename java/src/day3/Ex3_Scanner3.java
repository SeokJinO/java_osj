package day3;

import java.util.Scanner;

public class Ex3_Scanner3 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력받아 출력하는 코드를 작성하세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 num1을 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("정수 num2를 입력하세요.");
		int num2 = sc.nextInt();
		System.out.println("산술 연산자를 입력하세요.");
		char ch = sc.next().charAt(0);
		System.out.println(num1 + ch + num2);
		
		
	}

}
