package classlab.week3;

public class Student extends Person{
	public String major;
	
	public Student(String name, int age, String city, String major) {
		super(name, age, city); //referring to constructor of parent class
		this.major = major; //belongs to student class which is why its separate from super
	}
	
	public void printName() {
		System.out.println(this.name);
	}
	
	protected void printAge( ) {
		System.out.println("default constructor");
		System.out.println(getAge());
	}
	
	
	
	

}
