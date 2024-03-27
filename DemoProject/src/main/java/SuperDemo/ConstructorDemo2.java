package SuperDemo;

public class ConstructorDemo2 extends ConstructorDemo {

	public static void main(String[] args) {
		ConstructorDemo2 demo = new ConstructorDemo2();
		

	}
	ConstructorDemo2(){
		super(2);
		System.out.println("Constructor of child method");
		
	}
	

}
