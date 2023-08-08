package collection;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Examination {
	@Column(length = 10)
	private String subject;
	@Column
	private int marks;
	

	public Examination() {
		super();
	}

	public Examination(String subject, int marks) {
		super();
		this.subject = subject;
		this.marks = marks;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
