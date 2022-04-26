package day2;

public class Ex14_Test2 {

	public static void main(String[] args) {
		/* 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * A : 90점 이상 ~ 100 이하
		 * B : 80점 이상 ~ 90점 미만
		 * C : 70점 이상 ~ 80점 미만
		 * D : 60점 이상 ~ 70점 미만
		 * F : 0점 이상 ~ 60점 미만
		 * 0미만, 100초과인 경우 잘못된 성적이라고 출력하도록 수정하세요.
		 */
		int score = 99;
		if(score>=90&&score<=100) {
			System.out.println("A");
		}else if(score>=80&&score<90) {
			System.out.println("B");
		}else if(score>=70&&score<80) {
			System.out.println("C");
		}else if(score>=60&&score<70) {
			System.out.println("D");
		}else if(score>=0&&score<60) {
			System.out.println("F");
		}else {
			System.out.println("잘못된 성적");
		}
	}

}
