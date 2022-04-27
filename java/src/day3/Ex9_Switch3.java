package day3;

import java.util.Scanner;

public class Ex9_Switch3 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 switch문으로 작성하세요.
		 * 산술 연산자가 아닌 경우 값은 산술연산자가 아닙니다로 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수와 산술 연산자를 입력하시오.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		char op = sc.next().charAt(0);
		
		switch(op) {
		case '-': 
		    System.out.println(num1-num2);
		    break;
		case '+':
			System.out.println(num1+num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println((double)num1/num2);
			break;
		case '%':
			System.out.println(num1%num2);
			break;
		default :
			System.out.println(op +"는 산술 연산자가 아닙니다.");
		}
	}

}
