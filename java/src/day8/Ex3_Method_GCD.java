package day8;

public class Ex3_Method_GCD {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		int ans = gcd(a, b);
		System.out.println(ans);
		int ans1 = lcm(a, b);
		System.out.println(ans1);

	}

	/*
	 * 기능 : 두 정수가 주어지면 두 정수의 최대 공약수를 알려주는 메소드 
	 * 매개변수 : 두 정수 => int num1, int num2 
	 * 리턴타입 : 두 정수의 최대 공약수 => 정수 => int 메소드명 : gcd
	 */
	public static int gcd(int num1, int num2) {
		int res = 0;

		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				res = i;

		}
		return res;
	}

	/*
	 * 기능 : 두 정수의 최소 공배수를 알려주는 메소드 매개변수 : 두 정수 리턴타입 : int 메소드명 : 1cm
	 */
	public static int lcm(int a, int b) {
		int res = 0;

		for (int i = 1; i <= a * b; i++) {
			if (i % a == 0 && i % b == 0) {
				res = i;
				break;
			}
		}
		return res;
	}
}
