package day14;

import java.util.Scanner;

public class Ex2_BaseballGameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BaseballGame game = new BaseballGame(sc);
		game.run();
		sc.close();
	}

}
