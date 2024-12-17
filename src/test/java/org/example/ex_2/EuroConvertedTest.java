package org.example.ex_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EuroConvertedTest {

    //Євро в доллари
    @Test
    public void convert_EuroToDollar() {
        Currency euro = new Euro();
        Currency dollar = new Dollar();
        double amountInEuro = 100;
        double result = euro.convertTo(dollar, amountInEuro);
        assertEquals(106.38, Math.round(result * 100.0) / 100.0, 0.01);
    }

    //Євро в фунти стерлінги
    @Test
    public void convert_EuroToPound() {
        Currency euro = new Euro();
        Currency pound = new Pound();
        double amountInEuro = 100;
        double result = euro.convertTo(pound, amountInEuro);
        assertEquals(87.0, Math.round(result * 100.0) / 100.0, 0.01);
    }

    //Євро в йени
    @Test
    public void convert_EuroToYen() {
        Currency euro = new Euro();
        Currency yen = new Yen();
        double amountInEuro = 100;
        double result = euro.convertTo(yen, amountInEuro);
        assertEquals(15745, Math.round(result * 100.0) / 100.0, 0.01);
    }
}
