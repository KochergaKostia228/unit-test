package org.example.ex_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KilogramTranslationTest {
    //Кілограми в грами
    @Test
    public void translation_kilogramToGram() {
        Weight kilogram = new Kilogram();
        Weight gram = new Gram();
        double amountInKilogram = 1;
        double result = kilogram.translationTo(gram, amountInKilogram);
        assertEquals(1000.0, result);
    }

    //Кілограми в міліграми
    @Test
    public void translation_kilogramToMilligram() {
        Weight kilogram = new Kilogram();
        Weight milligram = new Milligram();
        double amountInKilogram = 1;
        double result = kilogram.translationTo(milligram, amountInKilogram);
        assertEquals(1000000.0, result);
    }

    //Кілограми в центнери
    @Test
    public void translation_kilogramToCentner() {
        Weight kilogram = new Kilogram();
        Weight centner = new Centner();
        double amountInKilogram = 1;
        double result = kilogram.translationTo(centner, amountInKilogram);
        assertEquals(0.01, result);
    }

    //Кілограми в тону
    @Test
    public void translation_kilogramToTon() {
        Weight kilogram = new Kilogram();
        Weight ton = new Ton();
        double amountInKilogram = 1;
        double result = kilogram.translationTo(ton, amountInKilogram);
        assertEquals(0.001, result);
    }
}
