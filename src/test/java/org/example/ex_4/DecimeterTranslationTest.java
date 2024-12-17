package org.example.ex_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimeterTranslationTest {
    //Дециметри в міліметри
    @Test
    public void translation_decimeterToMillimeter() {
        Measurement decimeter = new Decimeter();
        Measurement millimeter = new Millimeter();
        double amountInDecimeter = 100;
        double result = decimeter.translationTo(millimeter, amountInDecimeter);
        assertEquals(10000.0, result);
    }

    //Дециметри в сантиметри
    @Test
    public void translation_decimeterToCentimeter() {
        Measurement decimeter = new Decimeter();
        Measurement centimeter = new Centimeter();
        double amountInDecimeter = 100;
        double result = decimeter.translationTo(centimeter, amountInDecimeter);
        assertEquals(1000.0, result);
    }

    //Дециметри в метри
    @Test
    public void translation_decimeterToMeter() {
        Measurement decimeter = new Decimeter();
        Measurement meter = new Meter();
        double amountInDecimeter = 100;
        double result = decimeter.translationTo(meter, amountInDecimeter);
        assertEquals(10.0, result);
    }

    //Дециметри в кілометри
    @Test
    public void translation_decimeterToKilometer() {
        Measurement decimeter = new Decimeter();
        Measurement kilometer = new Kilometer();
        double amountInDecimeter = 100;
        double result = decimeter.translationTo(kilometer, amountInDecimeter);
        assertEquals(0.01, result);
    }
}
