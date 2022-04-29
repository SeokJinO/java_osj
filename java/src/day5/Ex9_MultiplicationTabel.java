package day5;

import java.util.Scanner;

public class Ex9_MultiplicationTabel {

	public static void main(String[] args) {
		
		/* 구구단 7단을 출력하는 코드를 작성하세요.
		 * 7 X 1 = 7
		 * 7 X 2 = 14
		 * 7 X 3 = 21
		 * ...
		 * 7 X 9 = 49*/
		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		
//		for(int i = 1; i<=9; i++) {
//			System.out.println(num + " X " + i + " = " + (num*i));
//		}
		
		/* 구구단 2단 ~ 9단까지 출력하는 코드를 작성하세요.
		 */

		
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
		}
	}

}
