package day11;

/* 학생 클래스를 작성하세요
 * 		 * 	- 학생 클래스 : 학년, 반, 번호, 이름, 국어, 영어, 수학 성적
		 * 	- 기능 : 
		 * 		- 학생 정보를 출력 o
		 * 		- 학년, 반, 번호가 주어졌을 때 일치하는지 확인하는 기능
		 * 		- 이름, 국어, 영어, 수학을 수정하는 기능
		 * 	- 생성자 : 이름, 학년, 반, 번호, 국어, 영어, 수학 성적이 주어졌을 때 초기화 하는 생성자*/
public class Ex6_Student {
	private String name;
	private int grade;
	private int classNumber;
	private int number;
	private double kor;
	private double eng;
	private double math;
	
	
	public Ex6_Student(String name, int grade, int classNumber, int number, double kor, double eng, double math) {
		this.name = name;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	void print() {
		System.out.println("==========================");
		System.out.print(grade + "학년 " + classNumber + "반 " + number + "번 " + name);
		System.out.println(" 국어 : " + kor + " 영어 : " + eng + " 수학 : " + math);
		System.out.println("==========================");
		
	}
	public boolean sameInfor(int grade, int classNumber, int number) {
		if(grade == 0 || classNumber == 0 || number == 0) {
			return false;
		}else if(this.grade == grade && this.classNumber == classNumber && this.number == number) {
			return true;
		}
		return false;
	}
	public void changeScore(String name, double kor, double eng, double math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	} 

}
