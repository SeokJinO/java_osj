package day15;

public class Ex4_Exception_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		//0번지~크기 -1번지까지 해야하는데 실수로 0번지~크기번지까지 하는 경우 가장 흔하게 하는 실수
		for(int i = 0; i<= arr.length; i++) {
			//System.out.println(arr[i]); //예외 발생
		}
		int num = 10;
		for(int i =0; i< num; i++) {
			System.out.println(arr[i]);
		}
	}
}
