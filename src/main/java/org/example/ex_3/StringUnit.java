package org.example.ex_3;

public class StringUnit {

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        StringBuilder reversedStr = new StringBuilder(str).reverse();
        return str.equals(reversedStr.toString());
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static int countConsonants(String str) {
        int count = 0;
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for (char c : str.toCharArray()) {
            if (consonants.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static int countWordOccurrences(String str, String word) {
        if (word == null || word.isEmpty()) {
            return 0;
        }
        String[] words = str.split(" ");
        int count = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }
}
