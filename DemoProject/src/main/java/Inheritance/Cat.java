package Inheritance;

public class Cat extends Animal{

	public static void main(String[] args) {
		Cat ct = new Cat();
		ct.sound();
		System.out.println(ct.color);
		ct.eat();
	}
	public void eat() {
		System.out.println("Eats");
	}
/*Program to find the total salary by hand of an Employee
Class 1
 Get basic pay, deduction and bonus from console.
Class 2
 Calculate hra (5% of basic pay) and pf (20% of basic pay).
Class 3
 Find the total salary (basicpay+hra-pf-deduction+bonus) and
get the salary slip
 Salary slip should contains :- basic pay, deduction, hra, pf,
bonus and total salary by hand*/
}
