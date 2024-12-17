package org.example.ex_5;

import org.example.ex_4.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GramTranslationTest {
    //Грами в міліграми
    @Test
    public void translation_gramToMilligram() {
        Weight gram = new Gram();
        Weight milligram = new Milligram();
        double amountInGram = 1;
        double result = gram.translationTo(milligram, amountInGram);
        assertEquals(1000.0, result);
    }

    //Грами в кілограми
    @Test
    public void translation_gramToKilogram() {
        Weight gram = new Gram();
        Weight kilogram = new Kilogram();
        double amountInGram = 1000;
        double result = gram.translationTo(kilogram, amountInGram);
        assertEquals(1.0, result);
    }

    //Грами в центнери
    @Test
    public void translation_gramToCentner() {
        Weight gram = new Gram();
        Weight centner = new Centner();
        double amountInGram = 1000;
        double result = gram.translationTo(centner, amountInGram);
        assertEquals(0.01, result);
    }

    //Грами в тонна
    @Test
    public void translation_gramToTon() {
        Weight gram = new Gram();
        Weight ton = new Ton();
        double amountInGram = 1000;
        double result = gram.translationTo(ton, amountInGram);
        assertEquals(0.001, result);
    }
}
