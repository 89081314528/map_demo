package ru.julia;

import java.util.*;

/**
 * есть текст, нужно заменить слова на конкретные - всех птиц заменить на берд, животных на энимал
 * выделить настройки в отдельный класс
 * метод, который принимает лист и возвращает, отсортировано он по возрастанию, или нет
 */
public class Task8 {
    public static void main(String[] args) {
        String text = "Птички- синички уснули в саду, коровки дают молоко, лошадки говорят игого";
        printChange(text);
    }

//    public static List<String> listFromMap(Map<String, String> map) {
//        List<String> list = new ArrayList<>(map.values()); // заполнить лист значениями из мапа
//        return list;
//    }

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
        System.out.println(changeAnimal.changeAnimal(list));
    }
}

