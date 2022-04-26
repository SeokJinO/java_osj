package day2;

public class Ex11_if1 {

	public static void main(String[] args) {
		// num이 짝수이면 짝수라고 출력하는 코드를 if문을 이용하여 작성하세요.
		if(true) {
			System.out.println("참입니다.");
		}
		if(false) {
			System.out.println("참입니다.");
		}
		int num = 4;
		if(num % 2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		// score가 90점 이상이고, 100점 이하이면 A학점이라고 출력하는 코드를 if문을 이용하여 작성하십시오.
		int score = 95;
		if(score>=90&&score<=100) {
			System.out.println("A학점");
		}
	}

}
