package org.example.ex_2;

public class Yen implements Currency {
    @Override
    public double convertTo(Currency targetCurrency, double amount) {
        return amount * getExchangeRateTo(targetCurrency);
    }

    @Override
    public double getExchangeRateTo(Currency targetCurrency) {
        if (targetCurrency instanceof Dollar) {
            return 1 / 147.87;
        } else if (targetCurrency instanceof Euro) {
            return 1 / 157.45;
        } else if (targetCurrency instanceof Pound) {
            return 1 / 180.46;
        }
        return 1.0;
    }
}