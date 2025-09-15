package inheritance;

public class Animal {

	String species;
	int age;
	
	public Animal(String species,int age) {
		this.species  = species;
		this.age = age;
	}
	public void eat() {
		System.out.println("the" +species+ " is eating");
	
	}
	public void sleep() {
		System.out.println("the" +species+ " is sleeping");
	}

}
