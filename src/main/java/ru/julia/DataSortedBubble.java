package ru.julia;

import java.util.ArrayList;
import java.util.List;

public class DataSortedBubble {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(-3);
        list.add(6);
        list.add(7);
        list.add(10);
        list.add(19);
        System.out.println(list);
        System.out.println(dataSorted(list));
    }
    public static List<Integer> dataSorted(List<Integer> list) {
        int max;
        for (int a = 0; a < list.size() - 1; a++) {
            int count = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    count = count + 1;
                    max = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, max);
                }
            }
            System.out.println(count);
            System.out.println(list);
            if (count == 0) {
                break;
            }
        }
        return list;
    }
}