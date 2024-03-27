package Interface;

public class InterfaceExampleChild implements InterfaceExample {

	@Override
	public void Display() {
		System.out.println("Display");
		
	}

	public static void main(String[] args) {
		InterfaceExampleChild inter = new InterfaceExampleChild();
		inter.Display();
		

	}

}
