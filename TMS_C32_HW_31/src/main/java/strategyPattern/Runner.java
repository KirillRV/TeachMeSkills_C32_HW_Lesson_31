package strategyPattern;

import strategyPattern.Calculator.PriceCalculator;
import strategyPattern.discount.FixedDiscount;
import strategyPattern.discount.LoyaltyDiscount;
import strategyPattern.discount.PercentageDiscount;

public class Runner {
    public static void main(String[] args) {
        PriceCalculator calculator = new PriceCalculator(new FixedDiscount(10));
        double price = 100;
        int loyaltyPoints = 120; // Пример количества баллов лояльности

        System.out.println("Цена со скидкой (фиксированная 10): " + calculator.calculatePrice(price, loyaltyPoints));

        calculator.setDiscountStrategy(new PercentageDiscount(0.2));
        System.out.println("Цена со скидкой (процентная 20%): " + calculator.calculatePrice(price, loyaltyPoints));

        calculator.setDiscountStrategy(new LoyaltyDiscount(0.15, 100));
        System.out.println("Цена со скидкой (лояльность, 15%): " + calculator.calculatePrice(price, loyaltyPoints));
        System.out.println("Цена со скидкой (лояльность, 15%, недостаточно баллов): " + calculator.calculatePrice(price, 50));
    }
}