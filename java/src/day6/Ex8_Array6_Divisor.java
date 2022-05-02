package day6;

import java.util.Scanner;

public class Ex8_Array6_Divisor {

	public static void main(String[] args) {
		/* 정수 num의 약수를 배열에 저장 한 후, 출력하는 코드를 작성하세요.
		 * 약수는 최대 10개만 저장 가능*/
		Scanner sc = new Scanner(System.in);
		
		int list[] = new int[10];
		int j=0;
		while(true) {
			int num = sc.nextInt();
			
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					list[j] = i;
					System.out.println(list[j]);
					j = j+1;
					
				}
			}j = 0;
			if(num<0) {
				break;
			}
		}
	}
}
