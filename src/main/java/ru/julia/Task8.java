package ru.julia;

import java.util.*;

/**
 * есть текст, нужно заменить слова на конкретные - всех птиц заменить на берд, животных на энимал
 * выделить настройки в отдельный класс
 */
public class Task8 {
    public static void main(String[] args) {
        String text = "Птички- синички уснули в саду, коровки дают молоко, лошадки говорят игого";
        String newText = deletePunctuationMarks(text);
        System.out.println(newText);
        List<String> list = listOfWords(newText);
        System.out.println(list);
        List<String> newList2 = listWithChanges(list);
        System.out.println(newList2);

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

    public static List<String> listWithChanges(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("синички")) {
                newList.add("bird");
            } else if (list.get(i).equals("коровки") || list.get(i).equals("лошадки")) {
                newList.add("animal");
            } else {
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}

