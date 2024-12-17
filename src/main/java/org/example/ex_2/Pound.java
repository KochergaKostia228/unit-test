package org.example.ex_2;

public class Pound implements Currency {
    @Override
    public double convertTo(Currency targetCurrency, double amount) {
        return amount * getExchangeRateTo(targetCurrency);
    }

    @Override
    public double getExchangeRateTo(Currency targetCurrency) {
        if (targetCurrency instanceof Dollar) {
            return 1 / 0.82;
        } else if (targetCurrency instanceof Euro) {
            return 1 / 0.87;
        } else if (targetCurrency instanceof Yen) {
            return 180.46;
        }
        return 1.0;
    }
}