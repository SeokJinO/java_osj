package day9;

import java.util.Scanner;

public class Ex3_Method3_Sort {

	public static void main(String[] args) {
		/* 5명의 학생의 성적을 입력받아 오름차순으로 출력하는 코드를 작성하세요.
		 * 단, 입력받은 성적은 배열에 저장해야 합니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		int stu[] = new int[5];
		
		
		for(int i =0; i<5; i++) {
			stu[i] = sc.nextInt();
		}
		Sort(stu);
		PrintArray(stu);
		
		for(int i = 0; i< stu.length; i++) {
			System.out.print(stu[i] + " ");
		}
		sc.close();
	}
	/* 기능 : 정수 배열이 주어지면 오름차순 으로 정렬하는 메소드
	 * 매개변수 : 배열 arr
	 * 리턴타입 : 오름 또는 내림차순 정리가 된 배열
	 * 메소드명 : bubbleSort
	 */
	public static int[] Sort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int a = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = a;
				}
			}
		}return arr;
	}
	public static void PrintArray(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
