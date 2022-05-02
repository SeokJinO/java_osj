package day6;

import java.util.Scanner;

public class Ex7_Array5_Score2 {

	public static void main(String[] args) {
		/*
		 * 최대 10명의 학생 성적을 저장하기 위한 배열을 선언하고, 
		 * 입력할 학생수를 입력받아 입력받은 학생수만큼 성적을 입력받고 출력하는 코드를
		 * 작성하세요. 예) 학생수를 입력하세요 : 3 1번학생 : 90 2번학생 : 80 3번학생 : 70
		 */
		Scanner sc = new Scanner(System.in);

		while (true) {
			int stu = sc.nextInt();
			int score[] = new int[10];

			if (stu > 10) {
				System.out.println("최대 10명까지 입니다.");
			} else if (stu <= 0) {
				System.out.println("최소 1명부터 입니다.");
			} else {
				for (int i = 0; i < stu; i++) {
					score[i] = sc.nextInt();
					System.out.println("학생 " + i + "의 점수 = " + score[i]);

				}
				break;

			}

		}

	}
}
