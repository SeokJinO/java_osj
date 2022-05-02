package day6;

import java.util.Scanner;

public class Ex5_Array3_Sum {

	public static void main(String[] args) {
		
		/* 학생 3명의 국어 성적을 입력받고 총점과 평균을 구하는 코드를 작성하세요.
		 *  단, 총점과 평균을 출력한 다음 학생 3명의 성적을 출력하세요.
		 */

		Scanner sc = new Scanner(System.in);

		int stu[] = new int[3];
		int total = 0;

		for (int i = 0; i < stu.length; i++) {
			stu[i] = sc.nextInt();
		}
		for (int i = 0; i < stu.length; i++) {
			total += stu[i];
		}
		System.out.println("학생 3명의 총점은 " + total);
		System.out.println("학생 3명의 평균은 " + (double) total / stu.length);
		for (int i = 0; i < stu.length; i++) {
			System.out.println("학생 " + i + " 의 성적은 " + stu[i]);
		}
	}

}
