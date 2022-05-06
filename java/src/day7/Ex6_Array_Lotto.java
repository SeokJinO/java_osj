package day7;

import java.util.Scanner;

public class Ex6_Array_Lotto {

	public static void main(String[] args) {
		/*
		 * 1~45 사이의 중복되지 않은 수 7개를 배열에 저장하는 코드를 작성하세요.
		 */
		// 강사님이 한 예제
		int min = 1, max = 45;
		int lotto[] = new int[7]; // 6번지가 보너스 번호
		int count = 0; // 배열에 저장된 중복되지 않은 숫자의 개수
		// 로또 당첨번호
		for (; count < lotto.length;) {
			int r = (int) (Math.random() * (max-min+1)+min);
			int i;
			// 중복체크
			for (i = 0; i < count; i++) {
				if (r == lotto[i]) {
					break;
				}
			}
			if (i == count) {
				lotto[count++] = r;
				System.out.print(r + " ");
			}
		}
		// 사용자 번호 : 1~45 사이의 정수 6개를 입력받아 user배열에 저장하는 코드를 작성하세요.

		Scanner sc = new Scanner(System.in);

		int user[] = new int[6];
		int cnum = 0;
		for (int i = 0; i < user.length; i++) {
			user[i] = sc.nextInt();
		}
		for (int i = 0; i < lotto.length-1; i++) {
			for (int j = 0; j < user.length; j++) {
				if (lotto[i] == user[j]) {
					cnum++;
				}
			}
		}
		
		switch(cnum) {
		case 6 : System.out.println("1등");
		break;
		case 5 : int k;
		for(k=0; k<user.length; k++) {
			if(user[k] == lotto[6]) {
				break;
			}
		}
		if(k == user.length) {
			System.out.println("3등");
		}else {
			System.out.println("2등");
		}
		break;
		case 4 : System.out.println("4등");
		break;
		case 3 : System.out.println("5등");
		break;
		default : System.out.println("꽝");

		}
	}
}
