package ru.julia;

import java.util.*;

/** 2 вариант
 * есть текст, нужно заменить слова на конкретные - всех птиц заменить на берд, животных на энимал
 * выделить настройки в отдельный класс
 */
public class Task10 {
    public static void main(String[] args) {
        String text = "Птички- синички уснули в саду, коровки дают молоко, лошадки говорят игого";
        printChange(text);
    }

    public static String deletePunctuationMarks(String text) {
        return text.replaceAll("\\.", "").replaceAll(",", "").
                replaceAll("!", "").replaceAll("\\?", "").replaceAll("\\-", "");
    }

    public static List<String> listOfWords(String newStr) {
        return Arrays.asList(newStr.split(" "));
    }

    public static void printChange(String text) {
        String newText = deletePunctuationMarks(text);
        System.out.println(newText);
        List<String> list = listOfWords(newText);
        System.out.println(list);
        ChangeAnimal changeAnimal = new ChangeAnimal(list);
        changeAnimal.change(list);
    }
}

