package ru.julia;

import java.util.ArrayList;
import java.util.List;

public class DataSortedBubble {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(-3);
        list.add(6);
        list.add(5);
        list.add(19);
        list.add(10);
        System.out.println(list);
        System.out.println(dataSorted(list, true));
    }

    public static List<Integer> dataSorted(List<Integer> list, boolean sortAscending) {
        if (sortAscending == true) {
            int upperBorder = list.size();
            int max = list.get(0);
            for (int i = 0; i < upperBorder; i++) {
                if (i < upperBorder - 1) {
                    if (list.get(i) <= list.get(i + 1)) {
                    } else {
                        max = list.get(i);
                        list.set(i, list.get(i + 1));
                        list.set(i + 1, max);
                    }
                } else {
                    if (list.get(i) <= list.get(upperBorder - 1)) {
                    } else {
                        max = list.get(i);
                        list.set(i, list.get(upperBorder - 1));
                        list.set(upperBorder - 1, max);
                    }
                    upperBorder = upperBorder - 1;
                }
            }
            return list;
        } else {
            int upperBorder = list.size();
            int min = list.get(0);
            for (int i = 0; i < upperBorder; i++) {
                if (i < upperBorder - 1) {
                    if (list.get(i) >= list.get(i + 1)) {
                    } else {
                        min = list.get(i);
                        list.set(i, list.get(i + 1));
                        list.set(i + 1, min);
                    }
                } else {
                    if (list.get(i) >= list.get(upperBorder - 1)) {
                    } else {
                        min = list.get(i);
                        list.set(i, list.get(upperBorder - 1));
                        list.set(upperBorder - 1, min);
                    }
                    upperBorder = upperBorder - 1;
                }
            }
            return list;
        }
    }
}