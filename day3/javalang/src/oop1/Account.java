package oop1;

public class Account {
	// Instance variables
	private int acno;
	private String ahname;
	private double balance;

	// constructor
	public Account(int no, String name) {
		acno = no;
		ahname = name;
	}

	public Account(int no, String name, double bal) {
		acno = no;
		ahname = name;
		balance = bal;
	}

	// methods
	public void deposit(double amount) {
		balance += amount;
	}

	public double getBalance() {
		return balance;
	}

}
