package Abstraction;

import java.util.Scanner;

public class CalculateSalaryy {

	public static void main(String[] args) {
		Employeee emp = new Contractor();
		Employeee employee = new FullTimeEmployee();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Employee Type");
		String employeetype = sc.next();
		System.out.println("Enter payment per hours");
		emp.paymentperhours=sc.nextInt();
		switch (employeetype) {
		case "contractor":
			System.out.println("Enter the working hours");
			emp.workinghours = sc.nextInt();
			emp.calculateSalary();
			break;
		case "fulltimeemployee":
			employee.calculateSalary();
			break;
		default:
			System.out.println("Employee Type is not Valid");
		}
	}
}



