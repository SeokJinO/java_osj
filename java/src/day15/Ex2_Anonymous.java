package day15;

public class Ex2_Anonymous {

	public static void main(String[] args) {
		TestA test = new TestA();
		test.test();
		
		Test test2 = new Test() {

			@Override
			public void test() {
				System.out.println("테스트 2");
				
			}
			
		};
		test2.test();
	}

}

interface Test {
	void test();
}

class TestA implements Test {

	@Override
	public void test() {
		System.out.println("테스트");

	}

}