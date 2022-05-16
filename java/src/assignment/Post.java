package assignment;

import day14.Item;

//게시물 작성 프로그램
public class Post {
	//게시물 내역의 최대 개수
	public static final int MAX = 10;
	//게시물 내역의 최대 개수는 10개
	private Content contents[] = new Content[MAX];
	private int count;
	private int anCount;
	private int geCount;

	public void readContents() {
		if (count == 0) {
			System.out.println("입력된 내역이 없습니다.");
			return;
		}
		for (int i = 0; i < count; i++) {
			System.out.println(i + 1 + ". " + contents[i]);
		}
	}

	public void readContent(int index) {
		if (index < 0) {
			System.out.println("해당 내역이 없습니다.");
		}
		System.out.println(contents[count - 1]);
	}
	
	public boolean insertContent(Content content) {
		//가계부에 쓸 공간이 없는 경우
		if(count == MAX) {
			return false;
		}
		//추가하는 내역이 비었을 때
		if(content == null) {
			return false;
		}
		contents[count++] = content;
		
		return true;
	}
	
	public boolean modifyContent(int modIndex, String title, String detail) {
		if(modIndex > count || modIndex < 0) {
			return false;
		}
		contents[modIndex].modify(title, detail);
		return true;
	}
	
}