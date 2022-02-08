package classlab.week3;
import java.util.Scanner;

public abstract class Person {
	//instance variables
	public String name;
	private int age;
	protected String city;
	
	//constructor
	public Person(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
		
	}
	
	//getter / accessor
	public int getAge() {
		return this.age;
	}
	
	//setter / mutator
	public void setage(int age) {
		this.age = age;
	}
	
	//methods
	public abstract void printName();
	
	protected abstract void printAge();
	
	public static void printObjectValues() {
		System.out.println("Object");
	}
	//static cannot access class variables
	


}
