package inheritance.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity(name = "inheritance.tableperclass.SalariedEmployee")
@Table(name = "img3_salariedemployees")
public class SalariedEmployee extends Employee {
	protected int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
