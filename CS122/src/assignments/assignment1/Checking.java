package assignments.assignment1;

public class Checking extends Account {

	public final double OVER_DRAFT_LIMIT = 500.00;
	
	public Checking(double balance, double annualInterestRate, int Id) {
		super(Id, balance, annualInterestRate);
	}
	
	// override
	public void withdraw(double amt)
	{
		if (getBalance() - amt <= OVER_DRAFT_LIMIT)
		{
			System.out.println("Insufficient");
		} else {
			super.withdraw(amt);
		}
	}
	
	//override toString
	public String toString() {
		String test = "Checking Account";
		test += super.toString();
		return test;
	}
}
