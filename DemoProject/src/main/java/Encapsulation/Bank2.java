package Encapsulation;

import java.util.Scanner;

public class Bank2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username : ");
		String userName = sc.next();
		System.out.println("Enter the Pin : ");
		int pin=sc.nextInt();
		Bank1 bank=new Bank1(userName,pin);
		bank.userValidate();
	}
	

}
