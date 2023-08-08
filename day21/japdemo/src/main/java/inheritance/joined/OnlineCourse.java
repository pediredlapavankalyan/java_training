package inheritance.joined;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "inheritance.joined.OnlineCourse")
@Table(name = "img3_onlinecourses")
public class OnlineCourse extends Course {
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	 

}
