package day3;

public class Ex14_For5_Divisor {

	public static void main(String[] args) {
		/* num의 약수를 출력하는 코드를 작성하세요.
		 * A의 약수 = A를 어떤 수로 나누었을 때 나머지가 0과 같은 수
		 */
		int a = 1284839234;
		for(int i=1; i<a+1; i++) {
			if(a%i==0)
				System.out.println(i);
		}
	}

}
