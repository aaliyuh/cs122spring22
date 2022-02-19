package assignments.assignment1;

public class Student extends Person {

	protected final int freshman = 0;
	protected final int sophomore = 1;
	protected final int junior = 2;
	protected final int senior = 3;
	protected int status;
	
	//constructors
	public Student(String name, String address, String phone, String email, int Status) {
		super(name,address,phone,email);
		this.status = Status;
	}
	
	public String getStatus() {
		String Status = "";
		if(status == 0)
			Status = "freshman";
		else if (status == 1)
			Status = "sophomore";
		else if (status == 2)
			Status = "junior";
		else if (status == 3)
			Status = "senior";
		return Status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	//override toString
	public String toString() {
		return "Student's Name: " + getName() + "\nStatus: " + getStatus();
	}
	

}
