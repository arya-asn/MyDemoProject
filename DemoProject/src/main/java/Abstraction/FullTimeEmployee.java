package Abstraction;

public class FullTimeEmployee extends Employeee{
	public final int WORKING_HOURS=8;

	@Override
	public void calculateSalary() {
		int payment = WORKING_HOURS*paymentperhours;
		System.out.println("Payment for FullTimeEmployee"+payment);		
		
	}

}
