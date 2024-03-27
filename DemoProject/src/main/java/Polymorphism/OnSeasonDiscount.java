package Polymorphism;

public class OnSeasonDiscount extends Season {
	@Override
    public double discount(double price) {
        return super.discount(price) * 0.4;
    }

}
