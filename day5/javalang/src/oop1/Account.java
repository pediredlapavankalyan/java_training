package oop1;

public class Account {
	// Instance variables
	private int acno;
	private String ahname;
	private double balance;
	// class variable
	private static int minbal = 5000;

	public Account(int acno, String ahname) {
		this.acno = acno;
		this.ahname = ahname;
	}

	public Account(int acno, String ahname, double balance) {
		this(acno, ahname); // call another constructor
		this.balance = balance;
	}

	// methods
	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (this.balance - Account.minbal >= amount)
			this.balance -= amount;
	}

	public double getBalance() {
		return this.balance;
	}

	// static or class method 
	public static int getMinbal() {
		
		return Account.minbal;
	}
}
