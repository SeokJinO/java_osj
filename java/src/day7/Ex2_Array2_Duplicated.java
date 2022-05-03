package day7;

import java.util.Scanner;

public class Ex2_Array2_Duplicated {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		
		/* 정수 num를 입력받고, 입력받은 정수가 배열에 있는지 없는지 확인하는 코드를 작성하세요*/
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = 0;
		for(int i =0; i<arr.length; i++) {
			if(num==arr[i]) {
				count ++;
			}
		}if(count >= 1) {
			System.out.println("있음");
		}else {
			System.out.println("없음");
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		count = 0;
		for(int i =0; i<arr.length; i++) {
			if(num==arr[i]) {
				count ++;
				break;
			}
		}if(count >= 1) {
			System.out.println("있음");
		}else {
			System.out.println("없음");
		}
	}

}
