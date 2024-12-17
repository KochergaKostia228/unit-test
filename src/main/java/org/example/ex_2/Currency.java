package org.example.ex_2;

public interface Currency {
    double convertTo(Currency targetCurrency, double amount);
    double getExchangeRateTo(Currency targetCurrency);
}
