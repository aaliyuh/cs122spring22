package classSamples.polymorphism.Firm;//********************************************************************
//  Employee.java       Author: Lewis/Loftus
//
//  Represents a general paid employee.
//********************************************************************

public class Employee extends StaffMember {
	protected String socialSecurityNumber;
	protected double payRate;

	// -----------------------------------------------------------------
	// Constructor: Sets up this employee with the specified
	// information.
	// -----------------------------------------------------------------
	public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone);

		socialSecurityNumber = socSecNumber;
		payRate = rate;
	}

	// -----------------------------------------------------------------
	// Returns information about an employee as a string.
	// -----------------------------------------------------------------
	public String toString() {
		String result = super.toString(); //call toString method from parent using "super" which is calling staff member

		result += "\nSocial Security Number: \n" + socialSecurityNumber;

		return result;
	}

	// -----------------------------------------------------------------
	// Returns the pay rate for this employee.
	// -----------------------------------------------------------------
	public double pay() {
		return payRate;
	}

	public double vacationDays() {
		return VACAY_DAYS;
	}
}
