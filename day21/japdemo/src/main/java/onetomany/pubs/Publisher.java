package onetomany.pubs;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "onetomany.pubs.Publisher")
@Table(name = "publishers")
public class Publisher {

	@Id
	@Column(name = "pub_id")
	private String id;

	@Column(name = "pub_name")
	private String name;

	@OneToMany(mappedBy = "publisher", fetch = FetchType.LAZY) // default is lazy
	private List<Title> titles = new ArrayList<Title>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Title> getTitles() {
		return titles;
	}

	public void setTitles(List<Title> titles) {
		this.titles = titles;
	}
	
	

}
