package Exception;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		int a = 4;
		int b = 0;
		try {
			int c =a/b;
			System.out.println(c);
		}
		/*catch(ArithmeticException e) {
			System.out.println("Aritmetic Exception Occured");
		}*/
		finally {
			System.out.println("Program is executed");
		}
	}
}
