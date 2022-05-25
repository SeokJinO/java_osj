package day22;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import day14.ConsoleProgram;

public class ScoreManager implements ConsoleProgram {

	private Scanner sc;
	private int exitMenu = 4;
	private List<Score> list = new ArrayList<Score>();

	public ScoreManager(Scanner sc) {
		if (sc == null)
			sc = new Scanner(System.in);
		this.sc = sc;
	}

	@Override
	public int selectMenu(Scanner sc) {
		return 0;
	}

	@Override
	public void excute(int menu) {
		switch (menu) {
		case 1:
			Score scr = addScore();
			insertScore(scr);
			break;
		case 2:
			printScore();
			break;
		case 3:
			modifyScore();
			break;
		case 4:
			break;
		default:
			System.out.println("올바른 메뉴를 선택하세요.");
		}

	}

	@Override
	public void run() {
		int menu = -1;
		do {
			try {
				printMenu();
				menu = sc.nextInt();
				excute(menu);
			} catch (InputMismatchException e) {
				printMessage("올바른 값을 입력하세요.");
				sc.next();
			} catch(RuntimeException e) {
				printMessage(e.getMessage());
			} catch(Exception e) {
				printMessage("예외 발생 : " + e.getMessage());
			}

		} while (menu != exitMenu);

	}
	private void printMessage(String str) {
		System.out.println("--------------------------");
		System.out.println(str);
		System.out.println("--------------------------");
	}

	private Score addScore() {
		System.out.print("과목명을 입력하세요 : ");
		String name = sc.next();
		System.out.print("중간고사 성적을 입력하세요 : ");
		int midterm = sc.nextInt();
		System.out.print("기말고사 성적을 입력하세요 : ");
		int finals = sc.nextInt();
		System.out.print("수행평가 성적을 입력하세요 : ");
		int performanceAssessment = sc.nextInt();
		System.out.print("학년을 입력하세요 : ");
		int grade = sc.nextInt();
		System.out.print("학기를 입력하세요 : ");
		int term = sc.nextInt();
		return new Score(grade, term, name, midterm, finals, performanceAssessment);
	}

	private void insertScore(Score scr) {
		if (scr == null) {
			return;
		}
		if (list.contains(scr)) {
			System.out.println("이미 추가된 성적입니다.");
			return;
		}
		list.add(scr);
	}

	private void printScore() {
		System.out.println("1. 모든 성적");
		System.out.println("2. 학기 성적");
		System.out.println("3. 과목 성적");
		System.out.print("서브메뉴를 선택하세요 : ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			for (Score tmp : list) {
				System.out.println(tmp);
			}
			break;
		case 2:
			System.out.print("학년을 입력하세요 : ");
			int grade = sc.nextInt();
			System.out.print("학기를 입력하세요 : ");
			int term = sc.nextInt();
			for (Score tmp : list) {
				if (tmp.getGrade() == grade && tmp.getTerm() == term) {
					System.out.println(tmp);
				}
			}
			break;
		case 3:
			System.out.print("과목을 입력하세요 : ");
			String name = sc.next();
			for(Score tmp : list) {
				if(tmp.getName().equals(name)) {
					System.out.println(tmp);
				}
			}
			
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
	}

	private void printMenu() {
		System.out.println("1. 성적 추가");
		System.out.println("2. 성적 확인");
		System.out.println("3. 성적 수정");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴를 선택하세요 : ");
	}
	private void modifyScore() {
		System.out.print("학년을 입력하세요 : ");
		int grade = sc.nextInt();
		System.out.print("학기를 입력하세요 : ");
		int term = sc.nextInt();
		System.out.print("과목을 입력하세요 : ");
		String name = sc.next();
		for (Score tmp : list) {
			if (tmp.getGrade() == grade && tmp.getTerm() == term && tmp.getName().equals(name)) {
				System.out.println(tmp);
				System.out.print("중간고사 성적을 입력하세요 : ");
				int midterm = sc.nextInt();
				tmp.setMidterm(midterm);
				System.out.print("기말고사 성적을 입력하세요 : ");
				int finals = sc.nextInt();
				tmp.setFinals(finals);
				System.out.print("수행평가 성적을 입력하세요 : ");
				int per = sc.nextInt();
				tmp.setPerformanceAssessment(per);
			}
		}
	}

}
