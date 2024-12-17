package org.example.ex_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentimeterTranslationTest {
    //Сантиметри в міліметри
    @Test
    public void translation_centimeterToMillimeter() {
        Measurement centimeter = new Centimeter();
        Measurement millimeter = new Millimeter();
        double amountInCentimeter = 100;
        double result = centimeter.translationTo(millimeter, amountInCentimeter);
        assertEquals(1000.0, result);
    }

    //Сантиметри в дециметри
    @Test
    public void translation_centimeterToDecimeter() {
        Measurement centimeter = new Centimeter();
        Measurement decimeter = new Decimeter();
        double amountInCentimeter = 100;
        double result = centimeter.translationTo(decimeter, amountInCentimeter);
        assertEquals(10.0, result);
    }

    //Сантиметри в метри
    @Test
    public void translation_centimeterToMeter() {
        Measurement centimeter = new Centimeter();
        Measurement meter = new Meter();
        double amountInCentimeter = 100;
        double result = centimeter.translationTo(meter, amountInCentimeter);
        assertEquals(1.0, result);
    }

    //Сантиметри в кілометри
    @Test
    public void translation_centimeterToKilometer() {
        Measurement centimeter = new Centimeter();
        Measurement kilometer = new Kilometer();
        double amountInCentimeter = 100;
        double result = centimeter.translationTo(kilometer, amountInCentimeter);
        assertEquals(0.001, result);
    }
}
