package Exception;

public class NumberFormatExceptionException {

	public static void main(String[] args) {
		        String numberString = "22.10";

		        try {
		            int number = Integer.parseInt(numberString);
		            System.out.println("Parsed number: " + number);
		       } catch (NumberFormatException e) {
		            System.out.println("Invalid number format");
		       }
		    }
		

	}

