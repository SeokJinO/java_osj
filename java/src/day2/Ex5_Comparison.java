package day2;

public class Ex5_Comparison {

	public static void main(String[] args) {
		/* >= , <= 를 반대로 쓰면 안됨. =>, =< (x)
		 * ==과 = 를 구분해서 써야 한다.
		 * 비교 연산자 -> 결과값이 참 또는 거짓
		 * 비교 연산자는 연산자를 기준으로 양 쪽의 수를 비교 
		 */
		int score = 95;
		System.out.println(score > 95);
		System.out.println(score >= 95);
		System.out.println(score < 95);
		System.out.println(score <= 95);
		System.out.println(score == 95);
		System.out.println(score != 95);
	}

}
