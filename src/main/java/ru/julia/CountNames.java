package ru.julia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1) лист с именами. надо посчитать сколько каких имен
 * для этого заполнить мап на основании листа. ключ - имя, значение - количество. если имя встречается еще раз, увеличиваем количество.
 * 2) текст  - выделить предложения. пр: №1. предложение
 * 3) есть текст, нужно заменить слова на конкретные - всех птиц заменить на берд, животных на энимал
 * 4) есть дата - день, месяц, год. сделать текстовое описание даты - двадцать второе февраля 2020
 */
public class CountNames {
    public static void main(String[] args) {
        int count = 0;
        List<String> names = new ArrayList<>();
        names.add("Ilia");
        names.add("Julia");
        names.add("Julia");
        names.add("Petya");
        names.add("Julia");
        for (int i = 0; i < names.size(); ++i) {
            if (names.get(i).equals("Julia")) {
                count = count + 1;
            }
        }
        System.out.println(count);

        Map<String, Integer> numberOfNames = new HashMap<String, Integer>();
        for (int i = 0; i < names.size(); ++i) {
            String key = names.get(i);
            if (numberOfNames.containsKey(key)) {
                numberOfNames.put(key, (numberOfNames.get(key) + 1));
            } else {
                numberOfNames.put(key, 1);
            }
        }
        System.out.println(numberOfNames.get("Ilia"));
    }
}
