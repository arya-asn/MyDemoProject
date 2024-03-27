package Inheritance;

public class Father extends GrandFather{

	public static void main(String[] args) {
		Father fath=new Father();
		System.out.println(fath.type);
		fath.Strict();
		fath.Character();
	}
	public void Character() {
		System.out.println("Nice behaviour");
	}

}
