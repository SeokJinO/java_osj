package day4;

import java.util.Scanner;

public class Ex2_For2_Score {

	public static void main(String[] args) {
		/* 세명의 국어 점수를 입력받아 총점과 평균을 구하는 코드를 작성하세요.
		 * 반복문 이용
		 */
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int j = 0;
		for(int i = 0; i<3; i++) {
			j = sc.nextInt();
			total = total + j;
		}
		
		double avg = total/3.0;
		System.out.println("총점은 "+ total);
		System.out.println("평균은 "+ avg);
		
		}
}