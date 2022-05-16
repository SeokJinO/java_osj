package day15;

public class Ex16_Exception_Test2 {

	public static void main(String[] args) {
		
		try {
			throw new UserException();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class UserException extends Exception {
	
	public UserException() {
		super("회원 관리 예외");
	}
	public UserException(String message) {
		super(message);
	}
}
