package day2;

public class Ex17_Test5 {

	public static void main(String[] args) {
		/* num이 2의 배수이면 2의 배수라고 출력하고,
		 * num이 3의 배수이면 3의 배수라고 출력하고,
		 * num이 6의 배수이면 6의 배수라고 출력하고,
		 * num이 2,3,6의 배수가 아니면 2,3,6의 배수가 아니라고 출력하는 코드를 작성하세요.
		 * 단, num이 6이면 6의 배수라고 출력해야 합니다. 2의배수, 3의배수 출력이 나오면 안됩니다.
		 */
		int num = 10;
		if(num%6==0) {
			System.out.println(num + "은 6의 배수입니다.");
		}else if(num%3==0) {
			System.out.println(num + "은 3의 배수입니다.");
		}else if(num%2==0) {
			System.out.println(num + "은 2의 배수입니다.");
		}else {
			System.out.println("2,3,6의 배수가 아닙니다.");
		}

	}

}
