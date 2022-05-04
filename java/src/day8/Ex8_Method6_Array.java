package day8;

public class Ex8_Method6_Array {

	public static void main(String[] args) {
		int[] arr = null;
		printArray(arr);

		int[] sum = { 1, 2, 3, 4, 5 };
		int num = 2;

		if (contains(sum, num) == true) {
			System.out.println("있습니다.");
		} else if (contains(sum, num) == false) {
			System.out.println("없습니다.");
		}
		System.out.println(contains(sum, 3, 4));

	}

	/*
	 * 기능 : 정수형 배열이 주어졌을 때, 주어진 배열의 값을 콘솔에 출력하는 메소드를 작성하세요. 
	 * 매개변수 : 정수형 배열 
	 * 리턴타입 : 없음 => void 
	 * 메소드명 : printArray
	 */
	public static void printArray(int[] a) {
		if (a == null || a.length == 0) {
			System.out.println("출력할 배열이 없습니다.");
			return;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	/*
	 * 기능 : 정수형 배열에 정수 num가 있는지 없는지 알려주는 메소드 
	 * 매개변수 : 정수형 배열, 정수 num 
	 * 리턴타입 : => 있는지 없는지. 참 거짓. boolean 
	 * 메소드명 : contains
	 */
	public static boolean contains(int arr[], int b) {
		if (arr == null || arr.length == 0) {
			return false;
		}
		for (int i = 0; i<arr.length; i++) {
			if (arr[i] == b) {
				return true;
			}
		}
		return false;
	}

	/*
	 * 기능 : 정수형 배열에서 처음부터 n개중에서 정수 num가 있는지 없는지 알려주는 메소드 
	 * 매개변수 : 정수형 배열, 정수 , 정수 
	 * 리턴타입 : boolean 
	 * 메소드명 : contains
	 */
	public static boolean contains(int[] arr, int n, int num) {
		if (arr == null || arr.length == 0) {
			return false;
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] == num) {
				return true;
			}
		}
		return false;
	}
}
