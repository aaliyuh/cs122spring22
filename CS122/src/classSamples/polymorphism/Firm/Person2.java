package classSamples.polymorphism.Firm;

public class Person2 implements Speaker{ 
	public void speak() {
		System.out.println("Person1 is speaking");
		
	}

	public void announce(String str) {
		System.out.println("Person1 is announcing" + str);
		
	}
}
