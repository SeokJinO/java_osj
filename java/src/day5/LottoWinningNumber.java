package day5;

public class LottoWinningNumber {

	public static void main(String[] args) {
		int min = 1, max =45;
		int r;
		
		for(int i = 0; i<6; i++) {
			r = (int)(Math.random() * (max-min+1)+min);
			System.out.print(r+" ");
		}

	}

}
