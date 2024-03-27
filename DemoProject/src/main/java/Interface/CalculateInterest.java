package Interface;

import java.util.Scanner;

public class CalculateInterest {

	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  amount ");
		int amount=sc.nextInt();
		System.out.println("Enter the duration ");
		int duration=sc.nextInt();
		hdfc.recurrringDeposit(amount, duration);
		
	}

}
