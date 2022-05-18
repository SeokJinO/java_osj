package day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex12_Set_Lotto {

	public static void main(String[] args) {
		/* Set을 이용하여 1~45 사이의 중복되지 않은 숫자 6개를 저장하고, 출력하는 코드를 작성하세요*/

		Set<Integer> set = new HashSet<Integer>();
		int min = 1, max = 45;
		for( ; set.size()<6; ) {
			int r = (int)(Math.random()*(max - min +1)+min);
			set.add(r);
		}
		System.out.println(set);

		
		while(set.size() < 6) {
			set.add((int)(Math.random()*(max - min +1)+min));
		}

		System.out.println(set);
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer tmp = it.next();
			System.out.print(tmp + " ");
		}
		System.out.println();
		//구매한 로또
		Set<Integer> user = new HashSet<Integer>();
		/* 스캐너를 이용하여 정수를 6개 입력받음. 중복되지 않은 숫자 6개를 입력할때까지. 범위는 로또와 같음*/
		Scanner sc = new Scanner(System.in);
		for( ; user.size()<6; ) {
			int num = sc.nextInt();
			if(num>0&&num<46) {
				user.add(num);
			}else {
				System.out.println("잘못 입력했습니다");
			}
			
		}
		System.out.println(user);
		
		/* lotto와 user에서 일치하는 숫자의 개수를 세서 출력하세요.*/
		int count = 0;
		for(Integer tmp : set) {
			if(user.contains(tmp)) {
				count++;
			}
		}
		System.out.println(count+ "개 확인");
	}

}
