package day6;

public class Ex6_Array4_Squared {

	public static void main(String[] args) {
		/* 배열에 1의 제곱부터 10의 제곱까지 저장하고, 출력하는 코드를 작성하세요.*/
		int arr[] = new int[10];
		
		for(int i = 1; i<=arr.length; i++) {
			arr[i-1] = i*i;
			System.out.println(arr[i-1]);
		}
	}

}
