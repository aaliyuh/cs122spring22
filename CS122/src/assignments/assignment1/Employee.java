package assignments.assignment1;

public class Employee extends Person {
	
	//office, salary, date hired
	protected String office, dateHired;
	protected double salary;
	
	//constructors
	public Employee(String name) {
		this(name, 0, "hi", dateHired());
	}
	
	private static String dateHired() {
		return null;
	}

	public Employee(String name, double salary, String office, String dateHired) {
		super(name);
		this.salary = salary;
		this.office = office;
		this.dateHired = dateHired;
	}
	
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//override toString
	public String toString() {
		return "Employee's name: " + getName() + "\nOffice: " + office + "\nSalary: " + salary + "\nDate Hired: " + dateHired;
	}


}
