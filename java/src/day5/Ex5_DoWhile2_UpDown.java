package day5;

import java.util.Scanner;

public class Ex5_DoWhile2_UpDown {

	public static void main(String[] args) {
		/* 랜덤으로 생성한 수를 맞추는 게임을 작성하세요.
		 * 정수를 입력했을 때 입력한 정수보다 랜덤으로 생성된 수가 크면 UP, 작으면 DOWN을 표시
		 * 맞으면 정답입니다 라고 표시
		 * 랜덤으로 생성한 수 : 40
		 * 입력 : 100
		 * DOWN
		 * 입력 : 50
		 * DOWN
		 * 입력 : 25
		 * UP 
		 * 입력 : 40
		 * 정답입니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		int min = 1, max =100;
		int r = (int)(Math.random() * (max-min+1)+min);
		int ans= -1;
		do{
			System.out.print("1~100사이의 정수를 입력하세요 : ");
			ans = sc.nextInt();
		
		if(ans<1||ans>100) {
			System.out.println("잘못된 수 입니다.");
			continue;
		}
		if(ans==r){
			System.out.println("정답입니다.");
		}
		if(ans>r) {
			System.out.println("DOWN");
		}
		if(ans<r) {
			System.out.println("UP");
		}
		}while(ans != r);
	}
}

