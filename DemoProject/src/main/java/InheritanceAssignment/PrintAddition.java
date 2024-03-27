package InheritanceAssignment;

import java.util.Scanner;

public class PrintAddition extends ReturnAddition{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		PrintAddition print = new PrintAddition();
		
		System.out.println("Enter a Number");
		print.num1=sc.nextInt();
		
		System.out.println("Enter next Number");
		print.num2=sc.nextInt();
		
		print.isDivisible();

	}
	public void isDivisible() {
		int result=super.addition();
		if(result%10==0) {
			System.out.println("Number is divisible by 10");
		}
		else {
			System.out.println("Number is not divisible by 10");
		}
	}

}
