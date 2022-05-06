package day9;

import java.util.Scanner;

public class Ex3_Method3_SortEx {

	public static void main(String[] args) {
		//강사님이 하신 예제) ↓↓
		
		/* 5명의 학생의 성적을 입력받아 오름차순으로 출력하는 코드를 작성하세요.
		 * 단, 입력받은 성적은 배열에 저장해야 합니다.
		 */
		//배열 선언 및 생성
		int score[] = new int[5];
		
		//반복문과 Scanner를 이용하여 성적을 입력 받음
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력(5명) : ");
		inputCreateArray(sc, 0);
		
		//반복문을 이용하여 성적을 정렬
		for(int i = 0; i<score.length-1; i++) {
			for(int j = 0; j<score.length-1-i; j++) {
				if(score[j] > score[j+1]) {
					int tmp = score[j];
					score[j] = score[j+1];
					score[j+1] = tmp;
				}
			}
		}
		
		//반복문을 이용하여 배열 값 출력
		printArray(score);
		sc.close();
	}
	public static void printArray(int num[]) {
		if(num == null || num.length == 0) {
			System.out.println("출력할 배열이 없습니다.");
			return;
		}
		for(int i = 0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
	
	public static int[] inputCreateArray(Scanner sc, int n) {
		if( n <= 0 ) {
			return null;
		}
		int arr[] = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
}
