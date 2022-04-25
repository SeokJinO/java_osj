package day1;

public class Ex1_Hello {
	// 콘솔 응용 프로그램이 실행되기 위해서 main이라는 메소드가 필요하다.
	public static void main(String[] args) {
		// 한줄주석
		/* 여러줄
		 * 주석 */
		
		// 한줄 주석은 아무 위치에서 사용 가능하지만 중간은 안됨
		/* println(문자열) : 문자열을 콘솔에 출력한 후 줄바꿈을 함
		 * print(문자열) : 문자열을 콘솔에 출력
		 */
		System.out.print("Hello World!!");
		System.out.println("Hello World!!"); // 한줄 주석은 주석기호가 나온 시점부터 해당 라인 끝까지 주석처리
		System.out.print("Hello World!!");
	}

}
