package day6;

public class Ex2_Break {

	public static void main(String[] args) {
		for(int i =1; i<=5; i++) {
			for(int j = 1; j<=5; j++) {
				System.out.println(i + ", " + j);
				if(j==3) {
					break;
				}
			}
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		out:for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.println(i + ", " + j);
				if(j==3) {
					break out;
				}
			}
		} // break을 만나면 out반복문의 끝이 이 위치로 이동
	}

}
