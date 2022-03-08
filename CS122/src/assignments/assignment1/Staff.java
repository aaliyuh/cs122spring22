package assignments.assignment1;

public class Staff extends Employee {
	//instance variables
	protected String title;
	
	//constructors
	public Staff(String name) {
		this(name, "");
	}
	
	public Staff(String name, String title) {
		super(name);
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	//methods
	public String toString() {
		return "Staff's name: " + getName() + "\nTitle: " + title;
	}
	
}
