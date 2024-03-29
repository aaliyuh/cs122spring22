package classSamples.polymorphism.Firm;//********************************************************************
//  Volunteer.java       Author: Lewis/Loftus
//
//  Represents a staff member that works as a volunteer.
//********************************************************************

public class Volunteer extends StaffMember {
	// -----------------------------------------------------------------
	// Constructor: Sets up this volunteer using the specified
	// information.
	// -----------------------------------------------------------------
	public Volunteer(String eName, String eAddress, String ePhone) {
		super(eName, eAddress, ePhone);
	}

	// -----------------------------------------------------------------
	// Returns a zero pay value for this volunteer.
	// -----------------------------------------------------------------
	public double pay() {
		return 0.0;
	}
	
	//public double vacationDays() {
	//	return 0;
	//}
	
	public String toString() {
		return super.toString() ;
	}
	
	public void payable() {
		System.out.println("Paid:");
	}
}
