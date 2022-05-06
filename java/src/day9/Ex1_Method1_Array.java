package day9;

import java.util.Scanner;

public class Ex1_Method1_Array {

	public static void main(String[] args) {
		/* 1~4사이의 중복되지 않은 3개의 수를 생성하여 배열에 저장하고 출력하는 코드를 작성하세요. 
		 * contains 와 printArray를 이용
		 * 3개짜리 배열을 생성
		 * 저장된 갯수가 3개가 될때까지 : count가 3가 아니면 동작 (count가 3보다 작으면 동작)
		 * 1 ~ 4 사이의 랜덤한 수 생성
		 * 배열에 count개만큼 랜덤한 수와 비교하여 있는지 없는지 확인해서 없으면 배열 count번지에 랜덤한 수 저장하고
		 * count를 1증가*/
		//3개짜리 배열을 생성
		int list[] = new int [3];
		int min = 1, max = 6;
		
		//저장된 갯수가 3개가 될때까지 : count가 3이 아니면 동작(count가 3보다 작으면 동작)
		for(int count = 0; count<3; ) {
			//1~4사이의 랜덤한 수 생성
			int r = (int)(Math.random() * (max-min + 1) + min);
			if(contains(list,count,r)==false) {
				list[count] = r;
				count++;
			}
		}
		System.out.print("랜덤한 수 = ");
		printArray(list);
		System.out.println("");
		//사용자가 1~9사이의 정수 3개를 입력
		Scanner sc = new Scanner(System.in);
		int user[] = new int[3];
		int strike = 0, ball =0;
		do {
			strike = 0;
			ball = 0;
			//사용자가 1~9사이의 정수 3개를 입력
			System.out.println("입력 : ");
			for(int i =0; i<3; i++) {
				user[i] = sc.nextInt();
			}
			// 스트라이크와 볼의 개수를 받아와서
			strike = getStrike(list, user);
			ball = getBall(list, user);
			// 스트라이크가 3개가 될 때 까지 반복
			// 아닐 시 스트라이크와 볼의개수 출력 또는 out 출력
			printResult(getStrike(list, user), getBall(list, user));
		}while(strike<3);
		sc.close();
	}

	/*
	 * 기능 : 정수형 배열에서 처음부터 n개중에서 정수 num가 있는지 없는지 알려주는 메소드 매개변수 : 정수형 배열, 정수 , 정수 리턴타입
	 * : boolean 메소드명 : contains
	 */
	public static boolean contains(int[] arr, int n, int num) {
		if (arr == null || arr.length == 0) {
			return false;
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] == num) {
				return true;
			}
		}
		return false;
	}

	public static void printArray(int[] a) {

		if (a == null || a.length == 0) {
			System.out.println("출력할 배열이 없습니다.");
			return;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	/* 기능 : 정수형 배열 2개가 주어지면 스트라이크 갯수(같은 자리에서 일치하는 숫자의 개수)를 알려주는 메소드
	 * 매개변수 : 배열 a,b
	 * 리턴타입 : 스트라이크 개수 => 정수 => int
	 * 메소드명 : getStrike*/
	public static int getStrike(int[] a,int[] b) {
		if(a == null || b == null) {
			return 0;
		}
		int count = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]==b[i]) {
				count++;
			}
		}
		return count;
	}
	
	/* 기능 : 정수형 배열 2개가 주어지면 볼 갯수(다른자리에서 일치하는 숫자의 개수) 를 알려주는 메소드
	 * 매개변수 : 배열 a,b
	 * 리턴타입 : 볼 개수 => 정수 => int
	 * 메소드명 : getBall*/
	
	public static int getBall(int[] a, int[] b) {
		if(a == null || b == null) {
			return 0;
		}
		int count = 0;
		for(int i=0; i<a.length; i++) {
			for(int j =0; j<b.length; j++) {
				if(i!=j&&a[i]==b[j]) {
					count++;
				}
				
			}
		}
		return count;
	}
	/* 기능 : 스트라이크와 볼의 갯수가 주어지면 결과를 콘솔에 출력하는 메소드
	 * 매개변수 : 정수 getStrike , 정수 getBall
	 * 리턴타입 : void
	 * 메소드명 : printResult*/
	public static void printResult(int getStrike , int getBall) {
		if(getStrike>=1||getBall>=1) {
		System.out.print(getStrike + "S ");
		System.out.println(getBall + "B ");
		}else {
			System.out.println("OUT");
		}
	}
}
