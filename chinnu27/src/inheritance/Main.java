package inheritance;

public class Main {

	public static void main(String[] args) {
		Dog mydog =new Dog("dog",3,"golden ritriever");
		
		mydog.eat();
		mydog.bark();
		mydog.sleep();
		
		System.out.println("My Dog's species:"+mydog.species);
		System.out.println("My Dog's age:"+mydog.age);
		System.out.println("My Dog's bread:"+mydog.breed);
	}

}
