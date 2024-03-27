package SuperDemo;

public class ConstructorDemo {
	ConstructorDemo(){
		System.out.println("Non parameterized");
	}
	ConstructorDemo(int a){
		this();
		System.out.println(a);
		
	}
	

}
