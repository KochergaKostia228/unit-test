package org.example.ex_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUnitTest {
    @Test
    public void bool_testIsPalindrome() {
        assertTrue(StringUnit.isPalindrome("Madam"));
        assertFalse(StringUnit.isPalindrome("Hello"));
    }

    @Test
    public void count_testCountVowels() {
        assertEquals(2, StringUnit.countVowels("Hello"));
        assertEquals(5, StringUnit.countVowels("Beautiful"));
        assertEquals(0, StringUnit.countVowels("Rhythm"));
    }

    @Test
    public void count_testCountConsonants() {
        assertEquals(3, StringUnit.countConsonants("Hello"));
        assertEquals(4, StringUnit.countConsonants("Beautiful"));
        assertEquals(6, StringUnit.countConsonants("Rhythm"));
    }

    @Test
    public void count_testCountWordOccurrences() {
        assertEquals(2, StringUnit.countWordOccurrences("Java is great, and Java is fun", "Java"));
        assertEquals(0, StringUnit.countWordOccurrences("Hello world", "Java"));
        assertEquals(2, StringUnit.countWordOccurrences("Hello hello", "hello"));
    }
}
