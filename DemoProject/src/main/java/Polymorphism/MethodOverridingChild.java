package Polymorphism;

public class MethodOverridingChild extends MethodOverriding {

	public static void main(String[] args) {
		MethodOverridingChild child = new MethodOverridingChild();
		child.Display();
		

	}
	public void Display() {
		super.Display();
		System.out.println("Same method name in parent and child class");
		
	}

}
