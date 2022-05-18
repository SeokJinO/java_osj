package day16;

public class Ex06_String_Search2 {

	public static void main(String[] args) {
		/* 주어진 str에 search가 몇번 있는지 출력하는 코드를 작성하세요.*/
		String str = "abcabcabbcbabc";
		String search = "ab";
		int count = 0;
		int index = str.indexOf(search);
		while(index >= 0) {
			System.out.println(str+" 문자열에 "+search +" 문자열은 " +index + "번지에 있습니다.");
			index = str.indexOf(search, index+search.length());
			count++;
		}
		System.out.println(count+ "번 반복 확인");
	}

}
