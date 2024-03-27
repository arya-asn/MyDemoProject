package Polymorphism;

import java.util.Scanner;

public class OffSeasonDiscount extends Season{
	public double discount(double price) {
        return super.discount(price) * 0.15;
    }

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the season name (onseason/offseason): ");
	        String season = scanner.nextLine();

	        System.out.print("Enter the price: ");
	        double price = scanner.nextDouble();


	        Season cloth;
	        if (season.equalsIgnoreCase("onseason")) {
	            cloth = new OnSeasonDiscount();
	        } else if (season.equalsIgnoreCase("offseason")) {
	            cloth= new Season();
	        } else {
	            System.out.println("Invalid season entered.");
	            return;
	        }

	        double discountedPrice = cloth.discount(price);
	        double totalPrice = price - discountedPrice;

	        System.out.println("Discounted price: Rs" + discountedPrice);
	        System.out.println("Total price: Rs" + totalPrice);
	    }
		

	}


