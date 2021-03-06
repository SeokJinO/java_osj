package day4;

public class Ex7_OverFlow {

	public static void main(String[] args) {
		/* 오버플러우 , 언더플로우는 정수에서 표현범위를 넘어가는 경우 발생*/
		byte num = 127;
//		byte로 표현 가능한 가장 큰 정수 127에 1을 더하면 128이 아닌 -128이 저장
//		byte는 128을 표현할 수 없기 때문에
//		이러한 현상을 오버플로우 라고 함
		num = (byte)(num + 1);
		System.out.println(num);
		
//		byte로 표현 가능한 가작 작은 정수 -128에 1을 빼면 -129이 아닌 127이 저장
//		byte는 -129를 표현할 수 없기 때문에
//		이러한 현상을 언더플로우 라고 함.
		num = (byte)(num -1);
		System.out.println(num);
	}

}
