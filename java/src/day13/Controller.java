package day13;

public interface Controller {
	int MIN = 1; //public static final이 앞에 자동으로 붙는다. 현재 줄에 public static final이 붙은것과 같음
	void run(); // public abstract가 앞에 자동으로 붙는다. 현제 줄에 public abstract가 붙은것과 같음
	void stop();
	void print();
	default void test() {
		System.out.println("테스트입니다.");
	}
	
}
