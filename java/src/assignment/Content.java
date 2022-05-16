package assignment;

import day14.Item;

public class Content implements Cloneable {

	private String title;
	private String detail;

	@Override
	public Content clone() {
		Content obj = null;

		try {
			obj = (Content) super.clone();
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
		return obj;
	}

	
	@Override
	public String toString() {
		return "제목 : " + title + ", 내용 : " + detail;
	}


	//수정기능
	public void modify(String title, String detail) {
		if(title != null) {
			this.title = title;
		}
		if(detail != null) {
			this.detail = detail;
		}
	}

	
	public Content(String title, String detail) {
		this.title = title;
		this.detail = detail;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	


}
