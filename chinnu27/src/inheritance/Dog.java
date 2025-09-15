package inheritance;

public class Dog extends Animal{
	String breed;

	public Dog(String species,int age,String breed) {
		super(species,age);
		this.breed = breed;
	}
	public void bark() {
		System.out.println("the"  +breed+ " is barking");
	}
	
	

}
