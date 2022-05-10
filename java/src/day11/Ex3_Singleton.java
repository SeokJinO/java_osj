package day11;

public class Ex3_Singleton {

	public static void main(String[] args) {
		Test3 t1 = Test3.getInstance();
		Test3 t2 = Test3.getInstance();

		if (t1 == t2) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
	}

}

class Test3 {
	private static Test3 t = new Test3(5);
	private int num;
	//외부세어 생성자를 호출하지 못하도록 접근제한자를 private으로 설정
	private Test3(int num) {
		this.num = num;
	}

	public static Test3 getInstance() {
		return t;
	}
}