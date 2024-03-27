package Exception;

public class ArrayOutofBoundExceptionExample {

	public static void main(String[] args) {
		
		        int[] numbers = {3, 5, 7};

		        try {
		            int num = numbers[3];
		            System.out.println("Value: " + num);
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Array index out of bounds");
		        }
		        finally {
		        	System.out.println("Program executed");
		        }
	}
}
		   	


