package Encapsulation;

public class Atm {
	private int pin;
	private int a =1001;
	private int b = 1234;
	private int c =1212;
	public int getPin() {
		System.out.println("Pin is successfull");
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
		if (pin==a||pin==b||pin==c) {
			System.out.println("Valid pin");
		}
		else {
			System.out.println("Invalid pin");
		}
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	

}
