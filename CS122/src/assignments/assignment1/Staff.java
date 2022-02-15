package assignments.assignment1;

public class Staff extends Employee {
	//instance variables
	String title;
	
	//constructors
	public Staff() {
		
	}
	
	//methods
	public String toString() {
		return super.toString() + " " + title;
	}
	
}
