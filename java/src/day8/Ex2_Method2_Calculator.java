package day8;

public class Ex2_Method2_Calculator {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		char op = '/';
		double ans = calculator(num1,num2,op);
		System.out.println(ans);
		System.out.println(""+num1 + op + num2 + " = " + ans);

	}
	/* 기능 : 두 정수와 산술연산자가 주어지면 산술연산결과를 알려주는 메소드
	 * 매개변수 : 두 정수, 문자
	 * 리턴타입 : 두 정수의 산술연산자 결과값 => 실수 => double
	 * 메소드명 : calculator
	 * */
	public static double calculator(int num1, int num2, char op) {
		double res = 0;
		if(op == '+') {
			res = num1 + num2;
		}
		else if(op == '-') {
			res = num1 - num2;
		}
		else if(op == '*') {
			res = num1 * num2;
		}
		else if(op == '/') {
			res = (double)num1 / num2;
		}
		else if(op == '%') {
			res = num1 % num2;
		}
		return res;
	}
}
