package assignments.assignment1;

public class UniversityDriver {

	public static void main(String[] args) {
		// person, student, faculty, staff, employee

		Student s1 = new Student("Aaliyah", "202-63-103st", "123-456-7890", "aaliyahs@gmail.com", 0);
		Person p1 = new Person("Jasmine", "54-56-103st", "jasminesucks@gmail.com", "212-450-6767");
		Faculty f1 = new Faculty("Zayn Malik", "9AM - 5PM", "Professor");
		Staff staff = new Staff("Barbara", "Staff");
		Employee e1 = new Employee("Candice", 17.50, "office", "02/18/2022");

		//System.out.println("Student  Person  Faculty  Staff  Employee");
		//System.out.println("------------------------------------------");

		System.out.println(s1.toString());
		System.out.println("-----------------------------");
		System.out.println(p1.toString());
		System.out.println("-----------------------------");
		System.out.println(f1.toString());
		System.out.println("-----------------------------");
		System.out.println(staff.toString());
		System.out.println("-----------------------------");
		System.out.println(e1.toString());
		System.out.println("-----------------------------");

	}

}
