package day15;

public class Ex3_Exception_NullPointerException {

	public static void main(String[] args) {
		String str1 = "abc";
		System.out.println(str1.charAt(0));
		String str2 = null;
		//System.out.println(str2.charAt(0)); //경고 표시, 예외 발생
		/* 예외가 자주 발생하는 경우
		 * 1. 메소드를 호출 하는 경우 메소드에서 null처리를 안하면 발생할 수 있음*/
		//charAt(str2, 0); //경고 표시x, 예외 발생
		String arr[] = new String[10];
		for(String tmp : arr) {
			System.out.println(tmp.charAt(0));
		}
				

	}
	public static void charAt(String str, int index) {
		System.out.println(str.charAt(index));
	}
}
