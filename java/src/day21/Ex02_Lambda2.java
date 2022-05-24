package day21;

public class Ex02_Lambda2 {

	public static void main(String[] args) {
		//매개변수가 하나일 시 괄호 생략 가능 (int a)->{System.out.println("테스트 : " + a);};
		//아래와 같이 생략 가능
		Test1 t1 = a -> System.out.println("테스트 : " + a);
		t1.test(10);

		/*Test2 t2 = (int a, int b) -> {
			return a + b;
		}; 이 코드를 다음과 같이 줄일 수 있다.*/
		Test2 t2 = (int a, int b) -> a + b;
		System.out.println(t2.sum(10, 20));
	}

}
@FunctionalInterface
interface Test1 {
	void test(int a);
	//void test2(); 추상 메소드가 2개가 되기 때문에 에러 발생
}
@FunctionalInterface
interface Test2 {
	int sum(int a, int b);
}