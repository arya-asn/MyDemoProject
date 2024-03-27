package InheritanceAssignment;

public class SalaryCalculator extends Employeee{
	 double hra;
	 double pf;
	 
	 public void calculateSalary() {
		 hra = 0.05*basicPay;
		 pf = 0.2*basicPay; 
	 }


}
