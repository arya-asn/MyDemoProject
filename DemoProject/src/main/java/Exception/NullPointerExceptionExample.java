package Exception;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		try {
			String name = null;
			int size =name.length();
			System.out.println(size);
		}
		catch(NullPointerException e) {
			System.out.println("NullPointer Exception occcured");
			
		}
		finally {
			System.out.println("Program execution successfull");
		}
		

	}

}
