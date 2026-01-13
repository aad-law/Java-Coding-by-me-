package Abstraction;

public class Human extends Animal{
	
	@Override
	public void eat() {
		System.out.println("Eating with kata and chammch");
	}
	
	@Override
	public void sleep() {
		System.out.println("Sleeping with full family in AC");
	}
	
	@Override
	public void sex(){
		System.out.println("WHenever they want, mens licking pussy womens sucking dicks ");
	}
	
	
	public static void main(String[] args) {
		Human human = new Human();
		human.eat();
		human.sleep();
		human.sex();
	}

}
