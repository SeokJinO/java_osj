package day8;

public class Ex4_Method4_Swap {

	public static void main(String[] args) {
		// 매개변수가 기본 타입 변수인 경우, 메소드 안에서 열심히 작업해도 원본은 안바뀜
		String num1 = "10", num2 = "20";
		System.out.println("main 메소드 - 전 num1 :" + num1 + ", num2 : " + num2);
		swap2(num1,num2);
		System.out.println("main 메소드 - 후 num1 :" + num1 + ", num2 : " + num2);

	}

	/*
	 * 기능 : 두 정수를 바꾸는 메소드 
	 * 매개변수 : 두 정수 => int num1 , int num2 
	 * 리턴타입 : 없음 => void 
	 * 메소드명 : swap
	 */
	public static void swap(int num1, int num2) {
		System.out.println("swap 메소드 - 전 num1 :" + num1 + ", num2 : " + num2);
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		System.out.println("swap 메소드 - 후 num1 :" + num1 + ", num2 : " + num2);
	}

	public static void swap2(String num1, String num2) {
		System.out.println("swap 메소드 - 전 num1 :" + num1 + ", num2 : " + num2);
		String tmp = num1;
		num1 = num2;
		num2 = tmp;
		System.out.println("swap 메소드 - 후 num1 :" + num1 + ", num2 : " + num2);
	}
}
