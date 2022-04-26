package day2;

public class Ex12_if2 {

	public static void main(String[] args) {
		/* num이 짝수이면 짝수라고 출력하고, 짝수가 아닐 시 홀수라고 출력하는 코드를
		 * if문을 이용하여 작성하십시오.
		 */
		int num = 5;
		if(num % 2 == 0) {
			System.out.println(num + "는(은) 짝수입니다.");
		} else {
			System.out.println(num + "는(은) 홀수입니다.");
		}
	}

}
