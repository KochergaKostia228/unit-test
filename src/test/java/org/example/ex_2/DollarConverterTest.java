package org.example.ex_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DollarConverterTest {

    //Доллар в євро
    @Test
    public void convert_DollarToEuro() {
        Currency dollar = new Dollar();
        Currency euro = new Euro();
        double amountInDollar = 100;
        double result = dollar.convertTo(euro, amountInDollar);
        assertEquals(94.0, result);
    }

    //Доллар в фунти стерлінги
    @Test
    public void convert_DollarToPound() {
        Currency dollar = new Dollar();
        Currency pound = new Pound();
        double amountInDollar = 100;
        double result = dollar.convertTo(pound, amountInDollar);
        assertEquals(82.0, result);
    }

    //Доллар в йени
    @Test
    public void convert_DollarToYen() {
        Currency dollar = new Dollar();
        Currency yen = new Yen();
        double amountInDollar = 100;
        double result = dollar.convertTo(yen, amountInDollar);
        assertEquals(14787, result);
    }
}
