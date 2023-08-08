package inheritance.joined;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "inheritance.joined.OfflineCourse")
@Table(name = "img3_offlinecourses")
public class OfflineCourse extends Course {
	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	 
	
}
