package inheritance.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "inheritance.tableperclass.Consultant")
@Table(name = "img3_consultants")
public class Consultant extends Employee {
	protected int rate;

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

}
