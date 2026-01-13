package Abstraction;

public class Dog extends Animal{
 
	@Override
	public void eat() {
		System.out.println("Dog is eating ");
	}

	@Override
	public void sleep() {
		System.out.println("ZZZ");
	}

	@Override
	public void sex() {
		System.out.println("When want babies");
	}
	
	public static void main(String[] args) {
		
	Dog dog = new Dog();
	
	dog.eat();
	dog.sleep();
	dog.sex();
		
	}
	
	
}
