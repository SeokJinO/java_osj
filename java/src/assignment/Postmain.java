package assignment;

import java.util.Scanner;

public class Postmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PostManager postmanager = new PostManager(sc);
		postmanager.run();
		sc.close();

	}

}
