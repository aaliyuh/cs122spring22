package classlab.week3;

public class StudentDriver {

	public static void main(String[] args) {
		Person.printObjectValues();
		//Person p = new Person("a", 8, "a");
		Student s = new Student("you", 23, "NYC", "CS");
		s.printAge();
		s.printAge();

	}

}
