package day2;

public class Ex13_if3 {

	public static void main(String[] args) {
		/* num이 양수이면 양수라고 출력하고,
		 * num이 음수이면 음수라고 출력하고,
		 * num이 0이면 0이라고 출력하는 코드를 if문을 이용하여 작성하세요.
		 */
		int num = 0;
		if(num>0) {
			System.out.println("양수");
		}else if(num<0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
	}

}
