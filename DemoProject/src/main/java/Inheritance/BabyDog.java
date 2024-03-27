package Inheritance;

public class BabyDog extends Dog{
	public static void main(String args[]) {
		BabyDog bd=new BabyDog();
		
		bd.bark();
		bd.sound();
		System.out.println("Color is "+bd.color);
		bd.play();
		
	}
	public void play() {
		System.out.println("Plays");
	}

}
