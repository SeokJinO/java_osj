package day23;

public class UpDown {
	
	private String name;
	private int count;
	
	public UpDown(String name, int count) {
		this.name = name;
		this.count = count;
	}

	@Override
	public String toString() {
		return name +" "+ count +"회";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
