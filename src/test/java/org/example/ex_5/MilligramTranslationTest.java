package org.example.ex_5;

import org.example.ex_4.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MilligramTranslationTest {
    //Міліграми в грами
    @Test
    public void translation_milligramToGram() {
        Weight milligram = new Milligram();
        Weight gram = new Gram();
        double amountInMilligram = 1000;
        double result = milligram.translationTo(gram, amountInMilligram);
        assertEquals(1.0, result);
    }

    //Міліграми в кілограми
    @Test
    public void translation_milligramToKilogram() {
        Weight milligram = new Milligram();
        Weight kilogram = new Kilogram();
        double amountInMilligram = 1000000;
        double result = milligram.translationTo(kilogram, amountInMilligram);
        assertEquals(1.0, result);
    }

    //Міліграми в центнери
    @Test
    public void translation_milligramToCentner() {
        Weight milligram = new Milligram();
        Weight centner = new Centner();
        double amountInMilligram = 1000000;
        double result = milligram.translationTo(centner, amountInMilligram);
        assertEquals(0.01, result);
    }

    //Міліграми в тону
    @Test
    public void translation_milligramToTon() {
        Weight milligram = new Milligram();
        Weight ton = new Ton();
        double amountInMilligram = 1000000;
        double result = milligram.translationTo(ton, amountInMilligram);
        assertEquals(0.001, result);
    }
}
