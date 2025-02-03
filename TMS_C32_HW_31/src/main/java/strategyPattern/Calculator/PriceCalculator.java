package strategyPattern.Calculator;

import strategyPattern.util.DiscountStrategy;

public class PriceCalculator {
    private DiscountStrategy discountStrategy;

    public PriceCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculatePrice(double price, int loyaltyPoints) {
        return discountStrategy.calculateDiscount(price, loyaltyPoints);
    }
}
