package org.example.ex_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeterTranslationTest {
    //Метри в міліметри
    @Test
    public void translation_meterToMillimeter() {
        Measurement meter = new Meter();
        Measurement millimeter = new Millimeter();
        double amountInMeter = 100;
        double result = meter.translationTo(millimeter, amountInMeter);
        assertEquals(100000.0, result);
    }

    //Метри в сантиметри
    @Test
    public void translation_meterToCentimeter() {
        Measurement meter = new Meter();
        Measurement centimeter = new Centimeter();
        double amountInMeter = 100;
        double result = meter.translationTo(centimeter, amountInMeter);
        assertEquals(10000.0, result);
    }

    //Метри в дециметри
    @Test
    public void translation_meterToDecimeter() {
        Measurement meter = new Meter();
        Measurement decimeter = new Decimeter();
        double amountInMeter = 100;
        double result = meter.translationTo(decimeter, amountInMeter);
        assertEquals(1000.0, result);
    }

    //Метри в кілометри
    @Test
    public void translation_meterToKilometer() {
        Measurement meter = new Meter();
        Measurement kilometer = new Kilometer();
        double amountInMeter = 100;
        double result = meter.translationTo(kilometer, amountInMeter);
        assertEquals(0.1, result);
    }
}
