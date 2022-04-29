package day5;

public class Ex7_NastedLoop2_Star {

	public static void main(String[] args) {
		/* 별찍기 예제
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 *  */
		for(int i=1; i<=5; i++) {
			for(int j =0; j<i; j++) {
				System.out.print("*");
			}System.out.println(" ");
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		/*     *
		 *    **
		 *   ***
		 *  ****
		 * *****   */
		for(int i=1; i<=5; i++) {
			for(int j = 1; j<=5-i; j++) {
				System.out.print(" ");
			}for(int x =0; x<i; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		/*      *        i=1 " "=4 *=1
		 *     ***       i=2 " "=3 *=3
		 *    *****      i=3 " "=2 *=5
		 *   *******     i=4 " "=1 *=7
		 *  *********    i=5 " "=0 *=9*/
		
		for(int i=1; i<=5; i++) {
			for(int j =0; j<6-i; j++) {
				System.out.print(" ");
			}for(int x = 1; x<i*2; x++) {
				System.out.print("*");
			}System.out.println("");
		}

		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		/*      *         i=1 " "=4 *=1 *=0
		 *     ** *       i=2 " "=3 *=2 *=1
		 *    *** **      i=3 " "=2 *=3 *=2
		 *   **** ***     i=4 " "=1 *=4 *=3
		 *  ***** ****    i=5 " "=0 *=5 *=4 
		 *                    " "=5-i *=i 8=? */
		
		for(int i =0; i<5; i++) {
			for(int j =0; j<5-i; j++) {
				System.out.print(" ");
			}for(int x=0; x<i+1; x++) {
				System.out.print("*");
			}for(int y=0; y<i; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
