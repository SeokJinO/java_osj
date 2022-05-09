package day10;

import java.util.Scanner;

public class Ex4_Class_Point {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = -1;
		Point3D1 p3 = new Point3D1(0, 0, 0);

		/*
		 * 아래와 같이 출력되도록 코드를 작성하세요 
		 * 메뉴 
		 * 1. 좌표설정 
		 * 2. 좌표출력 
		 * 3. 종료 
		 * 메뉴 선택 : 1 
		 * 좌표를 입력하세요 (예 : 1 2 3 ) : 1 2 3
		 */
		while (true) {
			System.out.println("메뉴\n" + "1.좌표설정\n" + "2.좌표출력\n" + "3.종료");
			num = sc.nextInt();
			if (num == 1) {
				System.out.println("좌표를 입력하세요 : (예 : 1 2 3) ");
				int x = sc.nextInt();
				int y = sc.nextInt();
				int z = sc.nextInt();
				p3 = new Point3D1(x, y, z);
			} else if (num == 2) {
				p3.PrintPoint();
			} else if (num == 3) {
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}

	}

}

/*
 * 다음 정보를 가지는 3차원에서 점을 나타내는 클래스를 생성하세요. 정보 : 점 x, 점 y, 점 z 기능 : 좌표를 출력하는 기능
 */
class Point3D1 {
	int x;
	int y;
	int z;

	public void PrintPoint() {
		System.out.println("좌표 : " + x + "," + y + "," + z);
	}

	public Point3D1(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}