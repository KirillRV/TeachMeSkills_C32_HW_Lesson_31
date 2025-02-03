package strategyPattern.discount;

import strategyPattern.util.DiscountStrategy;

public class PercentageDiscount implements DiscountStrategy {
    private final double discountPercentage;

    public PercentageDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateDiscount(double price, int loyaltyPoints) {
        return price * (1 - discountPercentage);
    }
}