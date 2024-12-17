package org.example.ex_5;

import org.example.ex_4.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentnerTranslationTest {
    //Центнери в грами
    @Test
    public void translation_centnerToGram() {
        Weight centner = new Centner();
        Weight gram = new Gram();
        double amountInCentner = 1;
        double result = centner.translationTo(gram, amountInCentner);
        assertEquals(100000.0, result);
    }

    //Центнери в міліграми
    @Test
    public void translation_centnerToMilligram() {
        Weight centner = new Centner();
        Weight milligram = new Milligram();
        double amountInCentner = 1;
        double result = centner.translationTo(milligram, amountInCentner);
        assertEquals(100000000.0, result);
    }

    //Центнери в кілограми
    @Test
    public void translation_centnerToKilogram() {
        Weight centner = new Centner();
        Weight kilogram = new Kilogram();
        double amountInCentner = 1;
        double result = centner.translationTo(kilogram, amountInCentner);
        assertEquals(100, result);
    }

    //Центнери в тону
    @Test
    public void translation_centnerToTon() {
        Weight centner = new Centner();
        Weight ton = new Ton();
        double amountInCentner = 1;
        double result = centner.translationTo(ton, amountInCentner);
        assertEquals(0.1, result);
    }
}
