package day3;

public class Ex6_if3 {

	public static void main(String[] args) {
		int num = 18;
		
		if(num % 2 == 0) {
			if(num % 3 == 0) {
				System.out.println(num + "는 6의 배수");
			}else {
				System.out.println(num + "는 2의 배수");
			}
		}else if(num % 3 == 0) {
			System.out.println(num + "는 3의 배수");
		}else {
			System.out.println(num + "는 2,3,6의 배수가 아님");
		}

	}

}
