package Abstraction;



public class Contractor extends Employeee{

	@Override
	public void calculateSalary() {
		
		
		int payment = paymentperhours*workinghours;
		System.out.println("Payment for Contractor "+payment);
				
	}	

}
