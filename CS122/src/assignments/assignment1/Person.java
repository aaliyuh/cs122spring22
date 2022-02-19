package assignments.assignment1;

public class Person {
	// name, address, phone number, email
	//instance variables 
	protected String name, address, email;
	protected String phoneNum;


	public Person(String name, String address, String email, String phoneNum) {
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
		this.email = email;
	}

	//class name and person name
	
	//constructors
	public Person(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
    // methods
	public String toString() {
		return "Person's name: " + getName()  + "\nAddress: " + address + "\nEmail: " + email + "\nPhone Number: " + phoneNum;
	}


}
