package day12;

import java.util.Scanner;

public class Ex7_Mart {
	/* 음료수 or 박스과자를 관리하는 마트 ( 종류는 최대 30개 => 음료수 + 박스 과자 종류)
	 * 1. 제품 등록 ( 신규 제품 )
	 * 2. 제품 입고
	 * 3. 제품 선택
	 * 4. 제품 구매
	 * 5. 프로그램 종료*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//제품을 관리하기 위한 배열
		Product list[] = new Product[30];
		//바구니 생성. 종류는 최대 30개
		Product basket[] = new Product[30];
		
		//저장된 판매 제품 갯수
		int listcount = 0;
		//장바구니에 담긴 제품 개수
		int basketCount = 0;
		
		int menu, subMenu;
		
		do {
			//메뉴 출력 후 메뉴를 선택
			menu = selectMenu(sc);
			switch (menu) {
			//선택한 메뉴가 1이면 제품 등록
			case 1:
				//서브 메뉴 출력 후 서브 메뉴를 선택
				subMenu = selectSubMenu(sc);
				
				switch (subMenu) {
				//올바른 서브메뉴를 선택하면
				case 1: case 2:
					//제품 정보를 입력 받아서 판매 제품 리스트에 추가
					list[listcount] = createProduct(subMenu, sc);
					//판매 제품 갯수 증가
					listcount++;
					break;
					//잘못된 서브메뉴를 선택하면
				default:
					System.out.println("선택할 수 없는 종류입니다.");
				}
				break;
				//선택한 메뉴가 2이면 제품 입고
			case 2:
				//입고 가능한 제품들을 출력
				printProductList(list, listcount);
				//제품을 선택하고 입고할 수량을 선택해서 판매 제품 리스트에 제품이 입고가 되면
				if (addAmountProductList(sc, list, listcount)) {
					System.out.println("입고가 완료되었습니다.");
				} else {
					System.out.println("입고에 실패하였습니다.");
				}
				break;
			case 3:
				//구매하기 위해 판매 제품 리스트를 출력
				printProductList(list, listcount);
				//제품을 선택과 수량을 선택함
				Product selectProduct = selectProduct(sc, list, listcount);
				//선택된 제품이 있으면 
				if (selectProduct != null) {
					//장바구니에 선택된 제품을 담고
					basket[basketCount] = selectProduct;
					//장바구니에 담긴 개수를 하나 증가
					basketCount++;
					//장바구니에 있는 목록을 출력
					printProductList(basket, basketCount);
				} else {
					System.out.println("선택된 제품이 없습니다.");
				}
				break;
			case 4:
				/* 현재 바구니에 담긴 목록을 출력하고
				 * 최종 합계를 출력
				 * 결제 금액을 입력
				 * 결제를 진행
				 * 		금액이 부족하면 결제를 취소할건지 물어봄
				 * 		취소하면 장바구니를 비움
				 * 		결제를 취소하지 않으면 장바구니를 보관
				 * 		결제가 정상적으로 완료되면
				 * 		거스름돈을 출력하고
				 * 		바구니를 비움*/
				printProductList(basket, basketCount);
				// 최종 합계 출력
				int sum = sumProductList(basket, basketCount);
				System.out.println("구매 총 금액 : " + sum);
				//결제 금액을 입력
				System.out.println("금액을 입력하세요 : ");
				int buyPrice = sc.nextInt();
				//결제를 진행
				if (sum > buyPrice) {
					System.out.println("결제를 취소하겠습니까? ( 취소시 장바구니 비워짐 ) : y/n");
					char cancel = sc.next().charAt(0);
					// 취소
					if (cancel == 'y' || cancel == 'Y') {
						//장바구니에 담긴 제품들을 마트에 돌려줘야 함
						returnProductList(list, listcount, basket, basketCount);
						//장바구니를 비움
						basketCount = 0;
					}
				} else {
					System.out.println("거스름돈 : " + (buyPrice - sum) + "원");
				}
				break;
			case 5:
				break;
			default:

			}
		} while (menu != 5);
		sc.close();
	}

	/* 기능 : 메뉴를 출력하고, 메뉴를 Scanner를 통해 입력받아 입력받은 메뉴를 알려주는 메소드
	 * 매개변수 : Scanner
	 * 리턴타입 : 입력받은 메뉴 => 정수 => int
	 * 메소드명 : selectMenu*/
	public static int selectMenu(Scanner sc) {
		int menu;
		System.out.println("====메뉴====");
		System.out.println("1. 제품 등록(관리자)");
		System.out.println("2. 제품 입고(관리자)");
		System.out.println("3. 제품 선택(고객)");
		System.out.println("4. 제품 구매(고객)");
		System.out.println("5. 프로그램 종료");
		System.out.println("메뉴 선택 : ");
		menu = sc.nextInt();
		System.out.println("===========");
		return menu;
	}

	/* 기능 : 제품등록에 대한 서브 메뉴를 출력하고, Scanner를 통해 서브 메뉴를 입력받아 서브메뉴를 알려주는 메소드
	 * 매개변수 : Scanner => Scanner sc
	 * 리턴타입 : 입력받은 서브메뉴 => 정수 => int
	 * 메소드명 : selectSubMenu*/
	public static int selectSubMenu(Scanner sc) {
		System.out.println("1. 음료수 등록");
		System.out.println("2. 박스과자 등록");
		return sc.nextInt();
	}

	/* 기능 : 선택한 subMenu에 맞는 제품 정보를 Scanner를 통해 입력받아 제품 객체를 생성한 후 생성한
	 * 		 제품을 알려주는 메소드
	 * 매개변수 : 선택한 subMenu, Scanner => int subMenu, Scanner sc
	 * 리턴타입 : 생성한 제품 => Product
	 * 메소드명 : createProduct */
	public static Product createProduct(int subMenu, Scanner sc) {
		System.out.println("제품명 : ");
		String name = sc.next();
		System.out.println("가격 : ");
		int price = sc.nextInt();
		System.out.println("수량 : ");
		int amount = sc.nextInt();
		switch (subMenu) {
		case 1:
			System.out.println("음료수 용량 : ");
			int capacity = sc.nextInt();
			return new Drink(name, price, amount, capacity);
		case 2:
			System.out.println("박스당 개수 : ");
			capacity = sc.nextInt();
			return new SnackBox(name, price, amount, capacity);
		default:
			return null;
		}
	}

	/* 기능 : 제품목록을 출력하는 메소드
	 * 매개변수 : 제품목록 => Product productList[], int listcount
	 * 리턴타입 : void
	 * 메소드명 : printProductList*/
	public static void printProductList(Product productList[], int listcount) {
		if (productList == null || listcount == 0) {
			System.out.println("등록된 제품이 없습니다.");
			return;
		}
		for (int i = 0; i < listcount; i++) {
			System.out.print(i + 1 + ". ");
			productList[i].print();
		}
	}

	/* 기능 : Scanner를 이용하여 제품 목록에서 제품을 선택하고 수량을 입력하여 추가하는 메소드
	 * 매개변수 : Scanner, 제품 목록, 등록된 제품의 개수 => Scanner sc, Product list[], int listCount
	 * 리턴타입 : 입고 여부 => boolean
	 * 메소드명 : addAmountProductList*/
	public static boolean addAmountProductList(Scanner sc, Product list[], int listCount) {
		if (list == null || listCount == 0) {
			return false;
		}
		System.out.print("입고할 제품을 선택하세요 : ");
		int num = sc.nextInt();
		System.out.print("입고할 제품의 수량을 입력하세요 : ");
		//입고된 수량
		int amount = sc.nextInt();
		//해당 제품의 수량을 변경
		if (num < 1 || num > listCount || amount <= 0) {
			return false;
		}
		//해당 제품의 수량을 변경
		//입고 전 수량
		list[num - 1].sumAmount(amount);
		return true;
	}

	/* 기능 : 스캐너를 이용하여 제품과 수량을 선택하면
	 * 		 제품리스트에서 해당 제품을 수량에 맞게 꺼내서 제품을 돌려주는 메소드
	 * 매개변수 : Scanner, 제품 리스트(마트), 제품 수량 => Scanner sc, Product list[], int listcount
	 * 리턴타입 : 선택된 제품 (입력한 수량으로) => Product
	 * 메소드명 : selectProduct
	 * */
	public static Product selectProduct(Scanner sc, Product list[], int listcount) {
		System.out.println("구매할 제품을 선택하세요 : ");
		int num = sc.nextInt();
		if (num > listcount) {
			return null;
		}
		System.out.println("구매할 제품의 수량을 입력하세요 : ");
		//입고된 수량
		int amount = sc.nextInt();
		Product buyProduct = list[num - 1];
		Product selectProduct = null;
		if (buyProduct instanceof SnackBox) {
			selectProduct = new SnackBox((SnackBox) buyProduct);
		} else if (buyProduct instanceof Drink) {
			selectProduct = new Drink((Drink) buyProduct);
		} else {
			return null;
		}
		//재고량보다 많은 수량을 입력한 경우
		if (buyProduct.getAmount() < amount) {
			//수량을 재고량으로 수정
			amount = buyProduct.getAmount();
		}
		selectProduct.setAmount(amount);
		buyProduct.sumAmount(-amount);
		return selectProduct;
	}

	/* 기능 : 제품 리스트가 주어지면 해당 제품 리스트의 합계를 구하여 알려주는 메소드
	 * 매개변수 : 제품 리스트 => Product list[], int listCount
	 * 리턴타입 : 합계 => int
	 * 메소드명 : sumProductList*/
	public static int sumProductList(Product list[], int listcount) {
		int sum = 0;
		for (int i = 0; i < listcount; i++) {
			sum += list[i].getPrice() * list[i].getAmount();
		}
		return sum;
	}

	/* 기능: 장바구니에 담은 제품들을 마켓에 돌려주는 메소드
	 * 매개변수 : 마켓제품 리스트, 장바구니 리스트 
	 *          => Product list[], int listcount, Product basket[], int basketCount
	 * 리턴타입 : 없음 => void
	 * 메소드명 : returnProductList*/
	public static void returnProductList(Product list[], int listcount, Product basket[], int basketCount) {
		if (list == null || basket == null) {
			return;
		}
		for (int i = 0; i < listcount; i++) {
			for (int j = 0; j < basketCount; j++) {
				Product pi = list[i];
				Product pj = basket[j];
				if (list[i].getName().equals(basket[j].getName())) {
					//pi.amunt : 재고량, pj.amount : 구매하려고 선택했던 수량
					pi.sumAmount(pj.getAmount());

				}
			}
		}
	}
}
