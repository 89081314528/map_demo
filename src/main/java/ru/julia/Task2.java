package ru.julia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1) текст - посчитать количество вхождений каждой буквы
 */
public class Task2 {
    public static void main(String[] args) {
        String text = "Julia loves Montenegro";

        Map<Character, Integer> numberOfLetters = new HashMap<Character, Integer>();

        for (int i = 0; i < text.length(); ++i) {
            Character key = text.charAt(i);
            if (numberOfLetters.containsKey(key)) {
                numberOfLetters.put(key, (numberOfLetters.get(key) + 1));
            } else {
                numberOfLetters.put(key, 1);
            }
        }
        System.out.println(numberOfLetters.get('l'));
    }
}

