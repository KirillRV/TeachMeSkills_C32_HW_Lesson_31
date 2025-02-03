package strategyPattern.discount;

import strategyPattern.util.DiscountStrategy;

public class LoyaltyDiscount implements DiscountStrategy {
    private final double discountPercentage;
    private final int loyaltyPointsThreshold;

    public LoyaltyDiscount(double discountPercentage, int loyaltyPointsThreshold) {
        this.discountPercentage = discountPercentage;
        this.loyaltyPointsThreshold = loyaltyPointsThreshold;
    }

    @Override
    public double calculateDiscount(double price, int loyaltyPoints) {
        if (loyaltyPoints >= loyaltyPointsThreshold) {
            return price * (1 - discountPercentage);
        } else {
            return price; // Скидки нет, если баллов недостаточно
        }
    }
}