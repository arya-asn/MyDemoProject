package InheritanceAssignment;

public class SalarySlip extends SalaryCalculator{
	double totalSalary;

	public static void main(String[] args) {
		SalarySlip salarySlip = new SalarySlip();
		salarySlip.getInput();
		salarySlip.calculateSalary();
		salarySlip.calculateTotalSalary();
		salarySlip.generateSlip();
		

	}
	public void calculateTotalSalary() {
        totalSalary = basicPay + hra - pf - deduction + bonus;
    }
	public void generateSlip() {
        System.out.println("Salary Slip");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Deduction: " + deduction);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }

}
