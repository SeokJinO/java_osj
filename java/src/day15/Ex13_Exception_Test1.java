package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex13_Exception_Test1 {

	public static void main(String[] args) {
		/* 5개짜리 정수 배열을 생성 한 후,
		 * 정수를 입력받아 입력받은 정수를 배열에 저장하고, 출력하는 코드를 작성하세요.
		 * 단, 중간에 잘못된 값을 입력하면 다시 입력받고록 코드를 작성. */
		
		int arr[] = new int[5];
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		while(count < 5) {
			try {
				System.out.print(count+1 + "번째 정수 입력 : ");
				 arr[count] = sc.nextInt();
				 count++;
			}catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다.");
				/* 문자 또는 문자열을 입력하고 엔터를 친 경우
				 * 입력버퍼에 해당 값들이 여전히 남아 있어서 sc.next()로
				 * 처리를 하지 않으면 무한루프에 빠짐
				 * 남아있는 값들을 제거해서 무한루프에 빠지지 않도록 하기위해
				 * sc.next()로 제거*/
				sc.next();
			}
		}
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println("프로그램 종료");
		sc.close();
	}

}
