package day2;

public class Ex10_Test1 {

	public static void main(String[] args) {
		/* num가 짝수인지 아닌지 확인하는 코드를 작성하세요
		 * A성적 출력하는 예제를 활용합니다.
		 */
		int num = 4;
		System.out.println(num + "는 짝수인가? "+ (num % 2 == 0));
		/* num가 짝수이면 num은 짝수라고 출력하고,
		 * num가 짝수가 아니면 num은 짝수가 아님이라고 출력하도록 코드를 작성해보세요.
		 */
		System.out.println(num + "는 짝수인가? "+ ((num % 2 == 0)? "짝수이다":"짝수가 아니다"));
	}

}
