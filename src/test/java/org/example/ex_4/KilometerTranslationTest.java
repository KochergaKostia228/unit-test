package org.example.ex_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KilometerTranslationTest {
    //Кілоетри в міліметри
    @Test
    public void translation_kilometerToMillimeter() {
        Measurement kilometer = new Kilometer();
        Measurement millimeter = new Millimeter();
        double amountInKilometer = 1;
        double result = kilometer.translationTo(millimeter, amountInKilometer);
        assertEquals(1000000.0, result);
    }

    //Кілоетри в сантиметри
    @Test
    public void translation_kilometerToCentimeter() {
        Measurement kilometer = new Kilometer();
        Measurement centimeter = new Centimeter();
        double amountInKilometer = 1;
        double result = kilometer.translationTo(centimeter, amountInKilometer);
        assertEquals(100000.0, result);
    }

    //Кілоетри в дециметри
    @Test
    public void translation_kilometerToDecimeter() {
        Measurement kilometer = new Kilometer();
        Measurement decimeter = new Decimeter();
        double amountInKilometer = 1;
        double result = kilometer.translationTo(decimeter, amountInKilometer);
        assertEquals(10000.0, result);
    }

    //Кілоетри в метри
    @Test
    public void translation_kilometerToMeter() {
        Measurement kilometer = new Kilometer();
        Measurement meter = new Meter();
        double amountInKilometer = 1;
        double result = kilometer.translationTo(meter, amountInKilometer);
        assertEquals(1000.0, result);
    }
}
