package day3;

import java.util.Scanner;

public class Ex1_Scanner1 {

	public static void main(String[] args) {
		/*  한 학생의 수학, 영어, 국어 성적을 입력받고, 총점과 평균을 구하세요.
		 * 단, 성적은 정수로 입력받고 0~100사이의 정수를 입력해야 합니다.
		 */
		
		System.out.println("수학, 영어, 국어 성적을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int math = sc.nextInt();
		int eng = sc.nextInt();
		int kor = sc.nextInt();
		
		System.out.println("총점은 "+ (kor+eng+math) + "입니다.");
		System.out.println("평균은 "+ ((double)(kor+eng+math)/3) +"입니다.");
		sc.close();
	}

}
