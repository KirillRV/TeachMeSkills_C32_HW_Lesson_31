package strategyPattern.util;

public interface DiscountStrategy {
    double calculateDiscount(double price, int loyaltyPoints);
}
