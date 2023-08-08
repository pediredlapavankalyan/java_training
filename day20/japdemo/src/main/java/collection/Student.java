package collection;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity(name = "collection.Student")
@Table(name = "I3_cl_students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 20)
	private String name;

	@ElementCollection
	@CollectionTable(name = "I3_student_exams" , 
	        joinColumns = @JoinColumn(name = "student"))
	private Set<Examination> exams = new HashSet<Examination>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Examination> getExams() {
		return exams;
	}

	public void setExams(Set<Examination> exams) {
		this.exams = exams;
	}


}
