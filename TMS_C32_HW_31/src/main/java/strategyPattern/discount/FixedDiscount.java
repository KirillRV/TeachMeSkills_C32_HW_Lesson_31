package strategyPattern.discount;

import strategyPattern.util.DiscountStrategy;

public class FixedDiscount implements DiscountStrategy {
    private final double discountAmount;

    public FixedDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double calculateDiscount(double price, int loyaltyPoints) {
        return Math.max(0, price - discountAmount); // Защита от отрицательной цены
    }
}
