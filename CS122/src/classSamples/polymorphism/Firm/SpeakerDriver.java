package classSamples.polymorphism.Firm;

public class SpeakerDriver {

	public static void main(String[] args) {
		Person1 person1 = new Person1();
		person1.speak();
		person1.announce("I got an F in computer programming");
		
		System.out.println();
		
		Person2 person2 = new Person2();
		person2.speak();
		person2.announce("I got an F in computer programming");
		
		System.out.println();
		
		Person3 person3 = new Person3();
		person3.speak();
		person3.announce("I got an F in computer programming");
		
		
		
		

	}

}
