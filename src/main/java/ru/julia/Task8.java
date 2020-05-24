package ru.julia;

import java.util.Arrays;
import java.util.List;

/**
 * 3) есть текст, нужно заменить слова на конкретные - всех птиц заменить на берд, животных на энимал
 */
public class Task8 {
    public static void main(String[] args) {

    }
    public static String deletePunctuationMarks2(String text) {
        return text.replaceAll("\\.", "").replaceAll(",","").
                replaceAll("!", "").replaceAll("\\?", "");
    }
    public static List<String> listOfWords2(String newStr) {
        return Arrays.asList(newStr.split(" "));}
}
