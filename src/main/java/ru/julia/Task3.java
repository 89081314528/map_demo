package ru.julia;

import java.util.HashMap;
import java.util.Map;

/**
 * текст - посчитать количество вхождений каждого слова. метод, который удаляет знаки препинания
 * из трех методов в задании 4
 */
public class Task3 {
    public static void main(String[] args) {
        String text = "Julia lovely, lovely cat!!!!!";
        String newText = deletePunctuationMarks(text);
        System.out.println(newText);
        Map<String, Integer> numberOfWords = new HashMap<String, Integer>();
        String key = "";
        for (int i = 0; i < newText.length(); i++) {
            for (int j = i + 1; j < newText.length(); j++) {
                if (newText.substring(j, j + 1).equals(" ")) {
                    key = newText.substring(i, j);
                    System.out.println(key);
                    if (numberOfWords.containsKey(key)) {
                        numberOfWords.put(key, (numberOfWords.get(key) + 1));
                        i = j;
                        break;
                    } else {
                        numberOfWords.put(key, 1);
                        i = j;
                        break;
                    }
                } else if (j == (newText.length() - 1)) {
                    key = newText.substring(i, j + 1);
                    System.out.println(key);
                    if (numberOfWords.containsKey(key)) {
                        numberOfWords.put(key, (numberOfWords.get(key) + 1));
                        i = j;
                        break;
                    } else {
                        numberOfWords.put(key, 1);
                        i = j;
                        break;
                    }
                }
            }
        }
        System.out.println(numberOfWords.get("lovely"));
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
