package assignments.assignment1;

public class Savings extends Account {
	
	public Savings(double balance, double annualInterestRate, int Id) {
		super(Id, balance, annualInterestRate);
	}
	
	public String toString() {
		String test = "Savings Account";
		test += super.toString();
		return test;
	}

}
