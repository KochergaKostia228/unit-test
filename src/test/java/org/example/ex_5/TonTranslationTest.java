package org.example.ex_5;

import org.example.ex_4.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TonTranslationTest {
    //Тонни в грами
    @Test
    public void translation_tonToGram() {
        Weight ton = new Ton();
        Weight gram = new Gram();
        double amountInTon = 1;
        double result = ton.translationTo(gram, amountInTon);
        assertEquals(1000000.0, result);
    }

    //Тонни в міліграми
    @Test
    public void translation_tonToMilligram() {
        Weight ton = new Ton();
        Weight milligram = new Milligram();
        double amountInTon = 1;
        double result = ton.translationTo(milligram, amountInTon);
        assertEquals(1000000000.0, result);
    }

    //Тонни в кілограми
    @Test
    public void translation_tonToKilogram() {
        Weight ton = new Ton();
        Weight kilogram = new Kilogram();
        double amountInTon = 1;
        double result = ton.translationTo(kilogram, amountInTon);
        assertEquals(1000.0, result);
    }

    //Тонни в центнери
    @Test
    public void translation_tonToCentner() {
        Weight ton = new Ton();
        Weight centner = new Centner();
        double amountInTon = 1;
        double result = ton.translationTo(centner, amountInTon);
        assertEquals(10, result);
    }
}
