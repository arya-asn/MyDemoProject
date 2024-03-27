package Interface;

public class HDFC implements RBI {

	@Override
	public void recurrringDeposit(int amount, int duration) {
		
		int totalAmount=amount+(amount*duration*INTEREST_RATE)/100;
		System.out.println("Total Amount after " +duration+ " years " +totalAmount);
		

	}

}
