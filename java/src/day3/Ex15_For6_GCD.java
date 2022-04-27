package day3;

public class Ex15_For6_GCD {

	public static void main(String[] args) {
		/* 두 정수의 최대 공약수를 구하는 코드를 작성하세요.
		 * 공약수 : 공통으로 있는 약수
		 * 최대 공약수 : 공약수 중 가장 큰 수
		 * 12 : 1 2 3 4 6 12
		 * 18 : 1 2 3 6 9 18
		 * 12와 18의 공약수 : 1 2 3 6
		 * 12와 18의 최대 공약수 : 6
		 */
		//효율적으로 다시 만들기****************************************
		/* 같은 타입의 변수를 여러개 선언하는 경우
		 * 타입 변수명1; 타입 변수명2;
		 * 타입 변수명3, 변수명4
		 */
		int i;
		int gcd = 0;
		int num1 = 12 , num2 = 18;
		
		for(i = 1; i<=num1; i++) {
			if(num1%i==0)
			if(num2%i==0)
					gcd=i;
		}System.out.println(gcd);
	}
}