package assignments.assignment1;

public class UniversityDriver {

	public static void main(String[] args) {
		// person, student, faculty, staff, employee

		Student s1 = new Student();
		Person p1 = new Person();
		Faculty f1 = new Faculty();
		Staff staff1 = new Staff();
		Employee e1 = new Employee();

		//System.out.println("Student  Person  Faculty  Staff  Employee");
		//System.out.println("------------------------------------------");

		System.out.println(s1.toString());
		System.out.println(p1.toString());
		System.out.println(f1.toString());
		System.out.println(staff1.toString());
		System.out.println(e1.toString());

	}

}
