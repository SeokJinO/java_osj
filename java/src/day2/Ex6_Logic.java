package day2;

public class Ex6_Logic {

	public static void main(String[] args) {
		/* AND (&&) = ~하고. ~이고. 둘 다 참이면 참, 하나라도 거짓이면 거짓.
		 * OR (||) = ~하거나. ~이거나. 둘 다 거짓이면 거짓. 하나라도 참이면 참.
		 * XOR (^) = 둘 다 참이면 거짓, 다르면 참.
		 * NOT (!) = 참은 거짓. 거짓은 참.
		 */
		// 성적이 A학점인가? A 학점의 기준은 90점 이상이고 100점 이하
		int score = 95;
		System.out.println(score + "점은 A학점인가? "+ (score>=90&&score<=100));
		/* 유효하지 않은 성적인가? 유효한 성적은 성적이 0점이상 100점이하
		 */
		System.out.println(score + "점은 유효하지 않은 성적인가? "+ (score<0||score>100));
		// 유효한 성적인가? 잘못된 성적의 반대
		System.out.println(score + "점은 유효한 성적인가? "+ !(score<0||score>100));
	}

}
