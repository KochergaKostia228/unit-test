package org.example.ex_2;

public class Dollar implements Currency {
    @Override
    public double convertTo(Currency targetCurrency, double amount) {
        return amount * getExchangeRateTo(targetCurrency);
    }

    @Override
    public double getExchangeRateTo(Currency targetCurrency) {
        if (targetCurrency instanceof Euro) {
            return 0.94;
        } else if (targetCurrency instanceof Pound) {
            return 0.82;
        } else if (targetCurrency instanceof Yen) {
            return 147.87;
        }
        return 1.0;
    }
}
