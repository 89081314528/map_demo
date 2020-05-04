package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * метод который принимает строку и возвращает лист со словами в этой строке
 */
public class Task4 {
    public static void main(String[] args) {
        String str = "Я научусь говорить слово прокрастинация!!!";
        System.out.println(listOfWords(str));
    }

    public static List listOfWords(String str) {
        String newStr = deletePunctuationMarks(str);
        List<String> words = new ArrayList<>();
        String word = "";
        for (int i = 0; i < newStr.length(); i++) {
            for (int j = i + 1; j < newStr.length(); j++) {
                if (newStr.substring(j, j + 1).equals(" ")) {
                    word = newStr.substring(i, j);
                    System.out.println(word);
                    words.add(word);
                    i = j;
                    break;
                } else if (j == (newStr.length() - 1)) {
                    word = newStr.substring(i, j + 1);
                    System.out.println(word);
                    words.add(word);
                    i = j;
                    break;
                }
            }
        }
        return words;
    }

    public static String deletePunctuationMarks(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.substring(i, i + 1).equals(".") || text.substring(i, i + 1).equals(",")
                    || text.substring(i, i + 1).equals("!")) {
            } else
                newText = newText + text.substring(i, i + 1);
        }
        return newText;
    }
}
