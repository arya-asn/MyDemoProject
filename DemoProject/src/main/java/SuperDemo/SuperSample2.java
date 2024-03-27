package SuperDemo;

public class SuperSample2 extends Supersample{

	public static void main(String[] args) {
		SuperSample2 obj = new SuperSample2();
		obj.print();
		

	}
	public void print() {
		System.out.println(age);
		System.out.println(super.age);
		display();
		super.display();
	}
	public void display() {
		System.out.println("Display");
	}
	int age=45;

}
