package day5;

public class Ex2_Random {

	public static void main(String[] args) {
		/* 0<= Math.random() <1 인 실수
		 * */
		int min = 3, max =10;
		int r;
		
		for(int i = 0; i<10; i++) {
			r = (int)(Math.random() * (max-min+1)+min);
			System.out.print(r+" ");
		}
		
	}

}
