package Inheritance;

public class Daughter extends Father {

	public static void main(String[] args) {
		Daughter dt = new Daughter();
		dt.Character();
		dt.Strict();
		System.out.println(dt.type);
		dt.Beautiful();
	}
	public void Beautiful() {
		System.out.println("I am looking beautiful");
	}

}
