package Abstraction;

public class AbstractSampleDemo extends AbstractSample{

	public static void main(String[] args) {
		AbstractSampleDemo demo = new AbstractSampleDemo();
		demo.Details1();
		demo.Details();
		demo.Display();
		

	}

	@Override
	public void Details1() {
		System.out.println("Details are given below");
		
	}
	public void Display() {
		System.out.println("Displayed");
	}

}
