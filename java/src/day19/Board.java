package day19;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	private String type, title, content, writer;
	private int num, view;
	private Date registerDate;

	private static int count = 0;

	public Board(String type, String title, String content, String writer) {
		this.type = type;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.num = ++count;
		this.registerDate = new Date();
	}

	public Board(String type, String title) {
		this.type = type;
		this.title = title;
	}

	public String getRegisterDate() {
		if (registerDate == null) {
			return null;
		}
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return format.format(registerDate);
	}

	public void modify(String title, String content) {
		this.title = title;
		this.content = content;
	}
	public void modify(int view) {
		this.view = view;
	}

	public void Print() {
		DecimalFormat df = new DecimalFormat("000");
		System.out.println(df.format(num) + "\t" + type + "\t" + title);
	}

	public void detailPrint() {
		System.out.println("번호 : " + num);
		System.out.println("제목 : " + title);
		System.out.println("작성자 : " + writer);
		System.out.println("작성일 : " + getRegisterDate());
		System.out.println("조회수 : " + view);
		System.out.println("내용 : " + content);
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("000");
		return df.format(num) + "\t" + type + "\t" + title + "\t" + content + "\t" + writer + "\t" + getRegisterDate() + "\t" + view;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		if (num != other.num)
			return false;
		return true;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}
	

}
