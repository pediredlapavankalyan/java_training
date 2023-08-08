package basics;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Table(name = "categories")
@Entity(name="Category")
public class Category {
	@Id
	@Column(name = "catcode")
	private String code;

	@Column(name = "catdesc")
	private String description;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@PreUpdate 
	public void beforeUpdate() {
		System.out.println("Updating");
		this.description = this.description.toUpperCase();
	}

	@Override
	public String toString() {
		return "Category [code=" + code + ", description=" + description + "]";
	}
}
