package rest;

public class Course {
	private String title;
	private int fee;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public Course(String title, int fee) {
		super();
		this.title = title;
		this.fee = fee;
	}

}
