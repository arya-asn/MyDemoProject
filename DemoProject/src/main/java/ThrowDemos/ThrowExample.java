package ThrowDemos;

import java.util.Scanner;

public class ThrowExample {
	static int age;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the age");
		age = sc.nextInt();
		ThrowExample obj = new ThrowExample();
		obj.Details();

	}

	public void Details() {
		if (age < 18) {
			throw new ArithmeticException("Not eligible");

		} else {
			System.out.println("Eligible");
		}

	}

}
