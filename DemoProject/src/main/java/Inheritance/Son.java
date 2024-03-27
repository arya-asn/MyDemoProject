package Inheritance;

public class Son extends Father{

	public static void main(String[] args) {
		Son sn =new Son();
		sn.Character();
		sn.Strict();
		System.out.println(sn.type);
		sn.Handsome();
	}
	public void Handsome() {
		System.out.println("I am so handsome");
	}

}
