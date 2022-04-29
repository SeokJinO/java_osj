package day5;

public class Ex10_NestedLoop4_Alphabet {

	/* a           'a'부터 'a'까지
	 * ab          'a'부터 'b'까지
	 * abc         'a'부터 'c'까지
	 * ....
	 * abcde...xyz 'a'부터 'z'까지
	 * 
	 * 반복횟수 : end는 'a'부터 'z'까지 1씩 증가
	 * 규칙성 : ch는 'a'부터 end까지 1씩 증가하며 ch를 출력*/
	public static void main(String[] args) {
		for(int end='a'; end<='z'; end++) {
			for(int j = 'a'; j<end+1; j++) {
				System.out.print((char)j);
			}System.out.println("");
		}

	}

}
