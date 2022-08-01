package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class DBMain {
	
	public static void main(String[] args) {
		Connection con = null;
		connect(con);
		DBDao dbDao = new DBDao();
		List<StudentVO> list = dbDao.selectStudent();
		Scanner sc = new Scanner(System.in);

		/* System.out.println("추가 학생 학번 : ");
		String st_num = sc.next();
		System.out.println("추가 학생 이름 : ");
		String st_name = sc.next();
		System.out.println("추가 학생 지도교수 번호 : ");
		String st_pr_num = sc.next();
		
		if(dbDao.insertStudent(st_num, st_name, st_pr_num) == 1) {
			System.out.println("추가에 성공했습니다.");
		}else {
			System.out.println("추가에 실패했습니다.");
		}
		*/
		System.out.println("수정 학생 학번 : ");
		String st_num = sc.next();
		System.out.println("수적 학생 이름 : ");
		String st_name = sc.next();
		if (dbDao.updateStudentName(st_num, st_name) == 1) {
			System.out.println("수정에 성공했습니다.");
		} else {
			System.out.println("수정에 실패했습니다.");
		}
		sc.close();

	}

	public static void connect(Connection con) {
		//String url = "jdbc:mysql://localhost:3306/데이터베이스명";
		String url = "jdbc:mysql://localhost:3306/university?serverTimezone=Asia/Seoul";
		String user = "root";
		String pw = "cjgreen";
		String driverName = "com.mysql.cj.jdbc.Driver";

		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("DB 연결에 성공했습니다.");
		} catch (ClassNotFoundException e) {
			//Class.forName(driverName); 에서 예외가 발생
			System.out.println(driverName + "클래스를 찾을 수 없습니다.");
		} catch (SQLException e) {
			//con = DriverManager.getConnection(url, user, pw); 에서 예외가 발생
			// 1. 없는 DB에 접근할 때
			// 2. user/pw이 틀렸을 때
			System.out.println("DB 연결에 실패하였습니다.");
		} catch (Exception e) {

		}
	}
}
