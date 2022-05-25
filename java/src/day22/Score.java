package day22;

public class Score {
	//과목명, 중간, 기말, 수행평가, 학년, 학기
	private String name;

	private int midterm, finals, performanceAssessment, grade, term;

	@Override
	public String toString() {
		return grade + "학년 "+ term	+ "학기 " + "["+name+"]" + " 중간 : " + midterm + " 기말 : " + finals + " 수행평가 : " + performanceAssessment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMidterm() {
		return midterm;
	}

	public void setMidterm(int midterm) {
		if (midterm < 0 || midterm > 100)
			new RuntimeException("중간고사는 0~100사이의 정수를 입력하세요.");
		this.midterm = midterm;
	}

	public int getFinals() {
		return finals;
	}

	public void setFinals(int finals) {
		if (midterm < 0 || midterm > 100)
			new RuntimeException("기말고사는 0~100사이의 정수를 입력하세요.");
		this.finals = finals;
	}

	public int getPerformanceAssessment() {
		return performanceAssessment;
	}

	public void setPerformanceAssessment(int performanceAssessment) {
		if (midterm < 0 || midterm > 100)
			new RuntimeException("중간고사 성적은 0~100사이의 정수를 입력하세요.");
		this.performanceAssessment = performanceAssessment;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		if (grade < 1 || grade > 3)
			new RuntimeException("학년은 1~3사이의 정수를 입력하세요.");
		this.grade = grade;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		if (term < 1 || term > 2)
			new RuntimeException("학기는 1~2사이의 정수를 입력하세요.");
		this.term = term;
	}

	public Score(int grade, int term, String name, int midterm, int finals, int performanceAssessment) {
		this.name = name;
		setMidterm(midterm);
		setFinals(finals);
		setPerformanceAssessment(performanceAssessment);
		setGrade(grade);
		setTerm(term);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		if (grade != other.grade)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (term != other.term)
			return false;
		return true;
	}

}
