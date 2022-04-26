package day2;

public class Ex7_Condition {

	public static void main(String[] args) {
		/* 조건 선택 연산자 (삼항 연산자) 예제
		 * (조건식) ? 참일 때 값 : 거짓일 때 값
		 * 성적이 A학점 이라면 "A학점" 이라 출력하고, 아니라면 "A학점이 아님"라고 출력 됨
		 */
		int score = 50;
		String isA = (score >= 90 && score<=100)?"A학점" : "A학점이 아님";
		System.out.println(score + "점은 " + isA);
	}

}
