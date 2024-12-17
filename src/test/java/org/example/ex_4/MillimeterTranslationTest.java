package org.example.ex_4;

import org.example.ex_2.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MillimeterTranslationTest {
    //Міліметри в сантиметри
    @Test
    public void translation_millimeterToCentimeter() {
        Measurement millimeter = new Millimeter();
        Measurement centimeter = new Centimeter();
        double amountInMillimeter = 100;
        double result = millimeter.translationTo(centimeter, amountInMillimeter);
        assertEquals(10.0, result);
    }

    //Міліметри в дециметри
    @Test
    public void translation_millimeterToDecimeter() {
        Measurement millimeter = new Millimeter();
        Measurement decimeter = new Decimeter();
        double amountInMillimeter = 100;
        double result = millimeter.translationTo(decimeter, amountInMillimeter);
        assertEquals(1.0, result);
    }

    //Міліметри в метри
    @Test
    public void translation_millimeterToMeter() {
        Measurement millimeter = new Millimeter();
        Measurement meter = new Meter();
        double amountInMillimeter = 100;
        double result = millimeter.translationTo(meter, amountInMillimeter);
        assertEquals(0.1, result);
    }

    //Міліметри в кілометри
    @Test
    public void translation_millimeterToKilometer() {
        Measurement millimeter = new Millimeter();
        Measurement kilometer = new Kilometer();
        double amountInMillimeter = 1000;
        double result = millimeter.translationTo(kilometer, amountInMillimeter);
        assertEquals(0.001, result);
    }
}
