package day14;

import java.util.Scanner;

public class AccountBookManager implements ConsoleProgram {

	private Scanner sc;
	private AccountBook abook; // 가계부
	private final int exitMenu = 5; // 종료 메뉴 번호

	public AccountBookManager(Scanner sc) {
		this.sc = sc;
		abook = new AccountBook();
		Item item = new Item("2022-05-15", false, "카드", "점심", 7000);
		abook.insertItem(item);
	}

	@Override
	public int selectMenu(Scanner sc) {
		System.out.println("=======메뉴=======");
		System.out.println("1. 가계부 확인");
		System.out.println("2. 가계부 추가");
		System.out.println("3. 가계부 수정");
		System.out.println("4. 가계부 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int menu = sc.nextInt();
		System.out.println("=================");
		return menu;
	}

	@Override
	public void excute(int menu) {
		switch (menu) {
		case 1:
			System.out.println("전체 확인(1) / 날짜 확인(2)");
			int choice = sc.nextInt();
			if(choice == 2) {
				System.out.print("날짜를 입력하세요 (예 0000-00-00) : ");
				String choosedate = sc.next();
				abook.printdate(choosedate);
			}else {
				readAccountBook();
			}
			
			break;
		case 2:
			if (insertAccountBook()) {
				System.out.println("내역을 추가했습니다.");
			} else {
				System.out.println("내역 추가에 실패하였습니다.");
			}
			System.out.println("=================");
			break;
		case 3:

			if (modifyAccountBook()) {
				System.out.println("수정에 성공하였습니다.");
			} else {
				System.out.println("수정에 실패하였습니다.");
			}
			System.out.println("=================");
			break;
		case 4:
			Item delItem = deleteAccountBook();
			if (delItem != null) {
				System.out.println(delItem);
				System.out.println("위 항목이 삭제되었습니다.");
				System.out.println("=================");
			} else {
				System.out.println("삭제에 실패했습니다.");
				System.out.println("=================");
			}
			break;
		case 5:
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
			System.out.println("==================");
		}
	}

	@Override
	public void run() {
		int menu;
		do {
			menu = selectMenu(sc);
			excute(menu);
		} while (menu != exitMenu);
		System.out.println("가계부가 종료되었습니다.");
		System.out.println("=================");
	}

	public void readAccountBook() {
		abook.readItems();
		System.out.println("===============");
	}

	public boolean insertAccountBook() {
		System.out.println("날짜 : ");
		String date = sc.next();
		System.out.println("수입(true) / 지출(false) : ");
		boolean income = sc.nextBoolean();
		System.out.println("결제 방식 : ");
		String payment = sc.next();
		System.out.println("항목 : ");
		String content = sc.next();
		System.out.println("금액 : ");
		int price = sc.nextInt();
		Item item = new Item(date, income, payment, content, price);
		return abook.insertItem(item);
	}

	public boolean modifyAccountBook() {
		abook.readItems();
		System.out.println("수정할 항목 : ");
		int modIndex = sc.nextInt();
		abook.readItem(modIndex);
		System.out.println("선택한 항목내역은 위 내역입니다. 수정하시겠습니까? (true / false) ");
		boolean ans = sc.nextBoolean();
		if(!ans) {
			return false;
		}
		System.out.println("수입(true) / 지출(false) : ");
		boolean income2 = sc.nextBoolean();
		System.out.println("날짜를 수정하겠습니까? (true/false) : ");
		boolean ok = sc.nextBoolean();
		String date2 = null;
		if(ok) {
			System.out.println("날짜 : ");
			date2 = sc.next();
		}
		System.out.println("결제 방식을 수정하겠습니까? (true/false) : ");
		ok = sc.nextBoolean();
		String payment2 = null;
		if(ok) {
			System.out.println("결제 방식 : ");
			payment2 = sc.next();
		}
		System.out.println("항목을 수정하겠습니까? (true/false) : ");
		ok = sc.nextBoolean();
		String content2 = null;
		if(ok) {
			System.out.println("항목 : ");
			content2 = sc.next();
		}
		System.out.println("금액을 수정하겠습니까? (true/false) : ");
		ok = sc.nextBoolean();
		int price2 = -1;
		if(ok) {
			System.out.println("금액 : ");
			price2 = sc.nextInt();
		}
		return abook.modifyItem(modIndex-1, date2, income2, payment2, content2, price2);
	}

	public Item deleteAccountBook() {
		abook.readItems();
		System.out.println("삭제할 항목 : ");
		int modIndex = sc.nextInt();
		abook.readItem(modIndex);
		System.out.println("선택한 항목내역은 위 내역입니다. 수정하시겠습니까? (true / false) ");
		boolean ans = sc.nextBoolean();
		if(!ans) {
			return null;
		}
		return abook.deleteItem(modIndex - 1);
	}
}

