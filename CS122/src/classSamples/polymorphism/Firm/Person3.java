package classSamples.polymorphism.Firm;

public class Person3 implements Speaker{
	public void speak() {
		System.out.println("Person 1 is speaking");
	}
	
	public void announce(String str) {
		System.out.println("Person 2 is announcing" + str);
	}

}
