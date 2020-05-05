package ru.julia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * текст - посчитать количество слов (количество пробелов плюс один)
 */
public class Task5 {
    public static void main(String[] args) {
        String str = "Я люблю свою родину вроде бы, я полжизни рабом на заводе был";
        String newString = deletePunctuationMarks(str);
        System.out.println(newString);
        System.out.println(countWords(newString));
    }
    public static int countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(" ")) {
                count = count + 1;
            }
        }
        return count + 1;
    }
    public static String deletePunctuationMarks(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.substring(i, i + 1).equals(".") || text.substring(i, i + 1).equals(",")
                    || text.substring(i, i + 1).equals("!")) {
            } else {
                newText = newText + text.substring(i, i + 1);
            }
        }
        return newText;
    }
}
