package day14;

import java.util.Scanner;

public class Ex1_AccountBookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		AccountBookManager accountBookManger = new AccountBookManager(sc);
		accountBookManger.run();
		sc.close();

	}

}
