package day9;

import java.util.Scanner;

public class Ex2_Method2_Lotto {

	public static void main(String[] args) {
		/*
		 * 앞 예제에서 사용한 메소드들을 필요하면 복사붙여넣기 해서 로또 프로그램을 작성하세요.
		 *  필요한 기능은 메소드로 추가해도 됩니다.
		 */
		Scanner sc = new Scanner(System.in);
		int min = 1, max = 7;
		int lotto[] = new int[7];
		int user[] = new int[6];


		// 로또 당첨번호 생성(랜덤. 1~45. 중복x. 6자리)
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
		// 로또 구매 : 로또번호 입력 (6자리, 1~45)
		for(int i =0; i<6; i++) {
			user[i] = sc.nextInt();
		}

		

		// 당첨 갯수 확인
		CorrectNumber(lotto, user);
		int cn = CorrectNumber(lotto, user);
		// 당첨 등수 출력
		rank(cn, user, lotto);
	}

	//로또 번호를 입력하면 배열을 만들어서 알려 주는 메소드
	
	//min~max 사이의 중복되지 않은 n개의 값을 생성하여 배열을 저장하는 메소드
	
	//배열 출력하는 메소드
	
	//배열 n개중에 num가 있는지 없는지 알려주는 메소드
	
	//당첨 갯수 알려주는 메소드
	public static int CorrectNumber(int lotto[], int user[]) {
		int count = 0;
		for(int i =0; i<lotto.length-1; i++) {
			for(int j =0; j<user.length; j++) {
				if(lotto[i]==user[j]) {
					count++;
				}
			}
		}return count;
	}
	
	//당첨 등수 출력하는 메소드
	
	public static void rank(int CorrectNumber, int[] user, int[] lotto) {
		switch(CorrectNumber) {
		case 6 : System.out.println("1등");
		break;
		case 5 :if(BonusNumber(lotto, user)==true) {
			System.out.println("2등");
		}else {
			System.out.println("3등");
		}
		break;
		case 4 : System.out.println("4등");
		break;
		case 3 : System.out.println("5등");
		break;
		default : System.out.println("꽝");
		}
	}
	
	public static boolean BonusNumber(int lotto[],int user[]) {
		for(int i =0; i<lotto.length; i++) {
			if(lotto[6]==user[i]) {
				return true;
			}
		}return false;
	}
}


