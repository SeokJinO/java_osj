package day2;

public class Ex3_Arithmetic {

	public static void main(String[] args) {
		/* 산술 연산자 주의 사항
		 * 
		 * 정수 연산자 정수 => 정수
		 * 5 + 2 = 7
		 * 5 - 2 = 3
		 * 5 * 2 = 10
		 * 5 % 2 = 1
		 * 5 / 2 = 2
		 * 정수 연산자 실수 => 실수
		 * 실수 연산자 실수 => 실수
		 * 실수 연산자 정수 => 실수
		 */
		System.out.println(5 + 2);
		System.out.println(5 - 2);
		System.out.println(5 * 2);
		System.out.println(5 % 2);
		System.out.println(5 / 2);
		// 따라서 실수로 표시 하려면 다음과 같이
		System.out.println(5 / 2.0);
		System.out.println(5 / (double)2);
		// 산술 연산자 주의 사항2; 0으로 나눈 경우 예외가 발생할 수 있다. (정수 / 0인 경우)
		System.out.println(5 / 0.0); 
		System.out.println(5 / 0); // -> 에러
		System.out.println("프로그램 종료");
		
	}

}
