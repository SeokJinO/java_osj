package day14;

import java.util.Scanner;

public class BaseballGame implements ConsoleProgram {

	private final int exitMenu = 3;
	private Scanner sc = new Scanner(System.in);
	private int com[] = new int[3];
	private int user[] = new int[3];
	private int record[] = new int[10];
	private int recordCount = 0; // 기록에 등록된 개수
	private int min = 1;
	private int max = 9;

	@Override
	public int selectMenu(Scanner sc) {
		System.out.println("========메뉴========");
		System.out.println("1. 플레이");
		System.out.println("2. 기록 확인");
		System.out.println("3. 프로그램 종료");
		System.out.println("===================");
		System.out.println("메뉴 선택 : ");
		int menu = sc.nextInt();

		return menu;
	}

	@Override
	public void excute(int menu) {
		switch (menu) {
		case 1:
			//컴퓨터 랜덤 수 생성
			createComRandom();
			//사용자 숫자 입력
			//S,B,O 판별
			//기록 저장
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			System.out.println("잘못된 메뉴를 선택했습니다.");
			System.out.println("====================");
		}
	}

	@Override
	public void run() {
		int menu;

		do {
			menu = selectMenu(sc);
			excute(menu);
		} while (menu != exitMenu);
		System.out.println("게임을 종료합니다.");
	}

	public BaseballGame(Scanner sc) {
		this.sc = sc;
	}

	public void createComRandom() {
		int count = 0;
		while (count < com.length) {
			//랜덤 수 생성
			int r = random(min, max);
			//중복 체크 => 중복되지 않으면 저장
			if(indexOf(com, count, r) == -1) {
				com[count++] = r;
				System.out.print(r + " ");
			}
			//count 증가
		}
	}

	public static int random(int min, int max) {
		if (min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int) (Math.random() * (max - min + 1) + min);
	}

	public static int indexOf(int arr[], int size, int num) {
		if(size == 0) {
			return -1;
		}
		if(arr.length< size) {
			size = arr.length;
		}
		for(int i = 0; i < size; i++) {
			if(arr[i] == num) {
				return i;
			}
		}
		return -1;
	}
}
