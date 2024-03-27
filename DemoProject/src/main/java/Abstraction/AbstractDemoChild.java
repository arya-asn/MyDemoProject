package Abstraction;

public class AbstractDemoChild extends AdstractDemo {

	public static void main(String[] args) {
		AbstractDemoChild demo = new AbstractDemoChild();
		demo.display1();
		demo.display();
	}

	@Override
	public void display1() {
		System.out.println("Abstract Method Implementation");
	
	}
	//child class should contain the implmentation of abstract method in parent class
}
