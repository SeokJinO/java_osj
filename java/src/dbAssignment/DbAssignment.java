package dbAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DbAssignment {
	public static Scanner sc = new Scanner(System.in);
	public static List<DbLogin> list = new ArrayList<DbLogin>();
	public static void main(String[] args) {
		
		
		
		while(true) {
			System.out.print("아이디를 입력하세요 : ");
			String Id = sc.next();
			System.out.print("패스워드를 입력하세요 : ");
			String passWord = sc.next();
			DbLogin dbl = new DbLogin(Id, passWord);
			if(list.contains(dbl)){
				System.out.println("로그인 성공");
				break;
			}else {
				System.out.println("로그인 실패");
			}
		}
	}
	public static void createId() {
		String createID = sc.next();
		String createPassWord = sc.next();
		DbLogin dbl = new DbLogin(createID, createPassWord);
		list.add(dbl);
	}
}
