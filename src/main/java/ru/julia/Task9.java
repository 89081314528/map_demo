package ru.julia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * есть дата - день, месяц, год. сделать текстовое описание даты - двадцать второе февраля 2020
 * 14.02.2020
 */
public class Task9 {
    public static void main(String[] args) {
        String date = "05.02.2020";
        dateTextDescription(date);
    }

    public static List<String> listOfWords(String str) {
        return Arrays.asList(str.split("\\."));
    }

    public static void dateTextDescription(String date) {
        List<String> list = listOfWords(date);
        System.out.println(list);
        ListDays listDays = new ListDays();
        ListMonth listMonth = new ListMonth();
        System.out.println(listDays.nameOfDay(Integer.parseInt(list.get(0))) + " " +
                listMonth.nameOfMonth(Integer.parseInt(list.get(1))) + " " + list.get(2));
    }
}

