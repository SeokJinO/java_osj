package day5;

import java.util.Scanner;

public class Ex11_BaseballGame {

	public static void main(String[] args) {
		/* 숫자 야구 게임을 작성하세요.
		 * 중복되지 않은 1~9사이의 세 정수를 입력받아 맞추는 게임
		 * 입력 : 1 2 3 
		 * 1ball        일치하는 숫자 x 숫자만 같음 1
		 * 입력 : 4 5 6
		 * out          일치하는 숫자 x 숫자만 같음 x
		 * 입력 : 7 8 9
		 * 2strike      일치하는 숫자 2 숫자만 같음 x
		 * 입력 : 8 3 9
		 * 1strike2ball 일치하는 숫자 1 숫자만 같음 2
		 * 입력 : 3 8 9
		 * 3strike      일치하는 숫자 3 숫자만 같음 x
		 * 프로그램 종료
		 * 
		 * 반복횟수 : S가 3보다 작을때까지 반복
		 * 규칙성 :  정수 3개를 입력 받음
		 * 		    com1과 user1이 같으면 S를 1 증가
		 * 			com2과 user2이 같으면 S를 1 증가
		 * 			com3과 user3이 같으면 S를 1 증가
		 * 			com1과 user2가 같거나 com1과 user3이 같으면 B를 1증가
		 * 			com2과 user1가 같거나 com1과 user3이 같으면 B를 1증가
		 * 			com3과 user1가 같거나 com1과 user2이 같으면 B를 1증가
		 * 			S가 0이 아니면 XS를 출력
		 * 			B가 0이 아니면 YB를 출력
		 * 			S가 0이고 B가 0이면 O를 출력
		 * 			
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 세개를 입력하십시오.");
		int com1 = 3, com2 = 8, com3 =9;
		
		
		
		while(true) {
			int user1 = sc.nextInt(),user2 = sc.nextInt(),user3 = sc.nextInt();
			int strike = 0;
			int ball = 0;
		if(com1==user1) {
			strike++;
		}else if(com1==user2) {
			ball++;
		}else if(com1==user3) {
			ball++;
		}if(com2==user2) {
			strike++;
		}else if(com2==user1) {
			ball++;
		}else if(com2==user3) {
			ball++;
		}if(com3==user3) {
			strike++;
		}else if(com3==user1) {
			ball++;
		}else if(com3==user2) {
			ball++;
		}else {
			System.out.println("OUT");
		}
		System.out.println(strike + "S "+ ball +"B");	
		if(strike==3) {
			break;
		}
		}
	}
}