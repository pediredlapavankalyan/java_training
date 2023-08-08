package onetomany.pubs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "onetomany.pubs.Title")
@Table(name = "titles")
public class Title {
	@Id
    @Column(name = "title_id")
	private String id;

	@Column(name = "title")
	private String title;

	@Column(name = "price")
	private Double price;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="pub_id")
	private Publisher publisher;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Publisher getPublisher() {
		return publisher;
	}


	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	

	 
}
