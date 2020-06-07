package ru.julia;

import java.util.ArrayList;
import java.util.List;

public class DataSortedBySelection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(-3);
        list.add(6);
        list.add(6);
        list.add(19);
        list.add(10);
        System.out.println(list);
        System.out.println(dataSorted(list));
    }

    public static List<Integer> dataSorted(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int a = 0; a < list.size(); ) {
            int minIndex = 0;
            Integer min = list.get(0);
            if (list.size() > 0) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) <= min) {
                        min = list.get(i);
                        minIndex = i;
                    }
                }
                newList.add(min);
                list.remove(minIndex);
            } else {
                return newList;
            }
        }
        return newList;
    }
}
