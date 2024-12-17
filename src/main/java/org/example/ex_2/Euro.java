package org.example.ex_2;

public class Euro implements Currency {
    @Override
    public double convertTo(Currency targetCurrency, double amount) {
        return amount * getExchangeRateTo(targetCurrency);
    }

    @Override
    public double getExchangeRateTo(Currency targetCurrency) {
        if (targetCurrency instanceof Dollar) {
            return 1 / 0.94;
        } else if (targetCurrency instanceof Pound) {
            return 0.87;
        } else if (targetCurrency instanceof Yen) {
            return 157.45;
        }
        return 1.0;
    }
}