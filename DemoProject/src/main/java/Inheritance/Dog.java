package Inheritance;
//Single Inheritance
public class Dog extends Animal{

	public static void main(String[] args) {
		Dog Obj=new Dog();
		Obj.sound();
		System.out.println("Color is "+Obj.color);
		Obj.bark();

	}
	public void bark() {
		System.out.println("Bow Bow");
	}

}
