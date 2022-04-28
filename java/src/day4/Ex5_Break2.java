package day4;

import java.util.Scanner;

public class Ex5_Break2 {

	public static void main(String[] args) {
		/* 정수를 5번 입력하고, 입력한 정수를 콘솔에 출력하는 코드를 작성하세요.
		 *  */
		Scanner sc = new Scanner(System.in);
		
		int minus;
		for(int i = 0; ; i++) {
			minus = sc.nextInt();
			if(minus<0) {
				System.out.println("음수입니다.");
				break;
			}System.out.println(minus);				
		}sc.close();
	}
}
