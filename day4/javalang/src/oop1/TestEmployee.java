package oop1;

class Employee {
	private String name, job;
	public Employee(String name, String job) {
		this.name = name;
		this.job = job;
	}
	public void print() {
		System.out.println(this.name);
		System.out.println(this.job);
	}
}

class SalariedEmployee extends Employee {
	private int salary;

	public SalariedEmployee(String name, String job, int salary) {
		super(name, job);
		this.salary = salary;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.salary);
	}

	public int getSalary() {
		return this.salary;
	}
}

public class TestEmployee {

	public static void main(String[] args) {
	     SalariedEmployee se = new SalariedEmployee("Jack", "Programmer",100000);
	     se.print();
	     

	}

}
