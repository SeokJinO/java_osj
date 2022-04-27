package day3;

public class Ex12_For3 {

	public static void main(String[] args) {
		/* 1부터 10 사이의 짝수를 출력하는 코드를 작성하세요.
		 * 2,4,6,8,10
		 */
		for(int i = 1; i<6; i++) {
			System.out.println(i*2);
		}System.out.println("ㅡㅡㅡㅡㅡㅡ");
		for(int i = 0; i<10; i++) {
			if(i%2==0)
			System.out.println(i+2);
		}System.out.println("ㅡㅡㅡㅡㅡㅡ");
		for(int i = 2; i<11; i+=2) {
			System.out.println(i);
		}
	}

}
