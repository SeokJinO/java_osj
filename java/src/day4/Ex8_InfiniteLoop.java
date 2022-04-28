package day4;

public class Ex8_InfiniteLoop {

	public static void main(String[] args) {

		//무한 루프
		for( ; ; ) {
			System.out.println("안녕하세요.");
		}
		
		//무수히 많은 숫자가 실행되지만 무한루프는 아님.
		//무한루프일 경우 반복문 아래 코드가 에러가 발생.
//		for(int i = 1; i > 0; i++) {
//			System.out.println(i);
//		}
		
	}

}
