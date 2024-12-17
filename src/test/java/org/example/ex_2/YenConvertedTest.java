package org.example.ex_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YenConvertedTest {

    //Йени в доллари
    @Test
    public void convert_YenToDollar() {
        Currency yen = new Yen();
        Currency dollar = new Dollar();
        double amountInYen = 10000;
        double result = yen.convertTo(dollar, amountInYen);
        assertEquals(67.63, Math.round(result * 100.0) / 100.0);
    }

    //Йени в євро
    @Test
    public void convert_YenToEuro() {
        Currency yen = new Yen();
        Currency euro = new Euro();
        double amountInYen = 10000;
        double result = yen.convertTo(euro, amountInYen);
        assertEquals(63.51, Math.round(result * 100.0) / 100.0);
    }

    //Йени в фунти стерлінги
    @Test
    public void convert_YenToPound() {
        Currency yen = new Yen();
        Currency pound = new Pound();
        double amountInYen = 10000;
        double result = yen.convertTo(pound, amountInYen);
        assertEquals(55.41, Math.round(result * 100.0) / 100.0);
    }

}
