package day7;

import java.util.Scanner;

public class Ex5_Array_Baseball {

	public static void main(String[] args) {
		/*
		 * 정수 3개짜리 배열 com을 생성 한 후 랜덤으로 세 정수를 만들어 배열에 저장하는 코드를 작성하세요. (중복 가능)
		 */
		Scanner sc = new Scanner(System.in);

		int min = 1, max = 9;
		int com[] = new int[3];

		
		/*
		 * 사용자가 정수 3개를 입력하여 3S가 될때까지 게임을 진행하도록 코드를 작성하세요. 단, 사용자가 입력한 정수도 배열에 저장.
		 */

		int user[] = new int[3];
		
		while (true) {
			int strike = 0;
			int ball = 0;
			System.out.print("3개의 정수 : ");
			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * (max - min + 1) + min);
				System.out.print(com[i]+ " ");
			}
			for (int i = 0; i < user.length; i++) {
				user[i] = sc.nextInt();
			}
			for (int i = 0; i < user.length; i++) {
				if (com[i] == user[i]) {
					strike++;
				}
			}
			for (int i = 0; i < user.length; i++) {
				for (int j = 0; j < user.length; j++) {
					if (i != j && com[i] == user[j]) {
						ball++;
					}
				}
			}
			if (strike == 3) {
				System.out.println("3Strike");
				break;
			} else if (strike == 0 && ball == 0) {
				System.out.println("OUT");
			} else {
				System.out.println(strike + "S " + ball + "B ");
			}
		}
	}

}
