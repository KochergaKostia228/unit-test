package org.example.ex_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PoundConvertedTest {
    //Фунти стерлінги в доллари
    @Test
    public void convert_PoundToDollar() {
        Currency pound = new Pound();
        Currency dollar = new Dollar();
        double amountInPound = 100;
        double result = pound.convertTo(dollar, amountInPound);
        assertEquals(121.95, Math.round(result * 100.0) / 100.0);
    }

    //Фунти стерлінги в євро
    @Test
    public void convert_PoundToEuro() {
        Currency pound = new Pound();
        Currency euro = new Euro();
        double amountInPound = 100;
        double result = pound.convertTo(euro, amountInPound);
        assertEquals(114.94, Math.round(result * 100.0) / 100.0);
    }

    //Фунти стерлінги в йени
    @Test
    public void convert_PoundToYen() {
        Currency pound = new Pound();
        Currency yen = new Yen();
        double amountInPound = 100;
        double result = pound.convertTo(yen, amountInPound);
        assertEquals(18046.0, result);
    }
}
