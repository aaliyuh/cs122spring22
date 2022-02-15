package assignments.assignment1;

public class Account {

	//good practice- start with private, then work your way to public
	// instance variables
	private int Id;
	private double balance;
	private double annualInterestRate;

	//constructors
	public Account() {
		Id = 0;
		balance = 0;
		annualInterestRate = 0;

	}

	public Account(int Id, double balance, double annualInterestRate) {
		this.Id = Id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;

	}

	//getters and setters for Id, balance, and annualInterestRate
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	//methods

	public double getMonthlyInterest() {
		return annualInterestRate * balance / 12;
	}

	public void deposit(double amount) {
		balance += amount;

	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;			
		} else {
			System.out.println("balance not sufficent");
		}

	}
	
	public String toString() {
		return "";
	}

}
