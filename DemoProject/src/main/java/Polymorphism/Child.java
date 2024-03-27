package Polymorphism;

public class Child extends Parent{

	public static void main(String[] args) {
		Parent p = new Child();
		p.walk();

	}
	
	public void walk() {
		super.walk();
		System.out.println("Child is walking");
	}
	

}
