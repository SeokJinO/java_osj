package Test;

import java.util.Random;

public class Bakjoon4673 {

	public static void main(String[] args) {
		
		String newPw = "";
		
		for(int i = 0; i<8; i++) {
			int x = (int)(Math.random() * 2);
			if(x == 1) {
			char newP = (char)((int)(Math.random()*26)+65);
			newPw += newP;
			} else {
				int newP = (char)((int)(Math.random()*10));	
				newPw += newP;
			}
		}
		System.out.println(newPw);
	}

}
