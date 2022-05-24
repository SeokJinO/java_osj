package day21;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Ex07_Lambda_Function {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, 1, 1, 100, 90, 80, "홍길동"));
		list.add(new Student(1, 1, 2, 80, 90, 100, "임꺽정"));
		list.add(new Student(1, 2, 3, 20, 30, 40, "둘리"));
		list.add(new Student(1, 2, 4, 40, 40, 100, "고길동"));
		
		System.out.println("1학년 학생들의 평균 : " +avg(list, s->s.getGrade()==1));
		System.out.println("1학년 1반 학생들의 평균 : " +avg(list, s->s.getGrade()==1 && s.getClassNum()==1));
		System.out.println("1학년 2반 학생들의 평균 : " +avg(list, s->s.getGrade()==1 && s.getClassNum()==2));
		System.out.println("1학년 1반 1번 학생 평균 : " +avg(list, s->s.getGrade()==1 && s.getClassNum()==1 && s.getNum()==1));
	}

	public static double avg(List<Student> list, Predicate<Student> function) {
		double sum = 0;
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			Student tmp = list.get(i);
			if (function.test(tmp)) {
				count++;
				sum += tmp.getEng() + tmp.getKor() + tmp.getMath();
			}
		}
		return sum / (double) (3 * count);
	}

	public static int sum(List<Student> list, String subject, BiFunction<Student, String, Integer> function) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += function.apply(list.get(i), subject);
		}
		return sum;
	}

}

class Student {
	private int grade, classNum, num, kor, eng, math;
	private String name;

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", classNum=" + classNum + ", num=" + num + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", name=" + name
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (classNum != other.classNum)
			return false;
		if (eng != other.eng)
			return false;
		if (grade != other.grade)
			return false;
		if (kor != other.kor)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		return true;
	}

	public Student(int grade, int classNum, int num, int kor, int eng, int math, String name) {
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}