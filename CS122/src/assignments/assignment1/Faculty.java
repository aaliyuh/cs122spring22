package assignments.assignment1;

public class Faculty extends Employee {
	//office hours, rank
	protected String officeHours;
	protected String rank;
	
	public Faculty(String name) {
		this(name, "6-2PM", "Employee");
	}
	
	public Faculty(String name, String officeHours, String rank) {
		super(name);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	//override toString
	public String toString() {
		return "Faculty's name: " + getName() + "\nOffice Hours: " + officeHours + "\nRank: " + rank;
	}

}
