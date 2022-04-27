package day3;

import java.util.Scanner;

public class Ex2_Scanner2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실수를 입력하세요 : ");
		double num1 = sc.nextDouble();
		System.out.println("입력한 실수는 "+ num1 + "입니다.");
		
		//next() : 앞 뒤 공백을 제외한 단어를 읽어옴
		System.out.println("단어를 입력하세요.");
		String str = sc.next();
		System.out.println("입력한 단어는 "+ str + "입니다.");
		
		//Scanner에는 문자를 받는 기능이 없음
		//charAt(번지) : 문자열에서 번지에 해당하는 문자를 가져옴. 0번지부터 시작
		System.out.println("문자를 입력하세요 : ");
		char ch = sc.next().charAt(0);
		System.out.println("입력한 문자는 "+ch+"입니다.");
		sc.close();
	}

}
