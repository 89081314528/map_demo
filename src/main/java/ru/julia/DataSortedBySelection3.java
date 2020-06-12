package ru.julia;
/**
 * используя set, без создания нового листа и копий
 */

import java.util.ArrayList;
import java.util.List;

public class DataSortedBySelection3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(-3);
        list.add(6);
        list.add(5);
        list.add(19);
        list.add(10);
        System.out.println(list);
        System.out.println(dataSorted(list, false));
    }

    public static List<Integer> dataSorted(List<Integer> list, boolean sortAscending) {
        for (int i = 0; i < list.size(); i++) {
            Integer minOrMax = list.get(i);
            int index = i;
            if (sortAscending == true) {
                for (int j = i; j < list.size(); j++) {
                    if (list.get(j) <= minOrMax) {
                        minOrMax = list.get(j);
                        index = j;
                    }
                }
            } else {
                for (int j = i; j < list.size(); j++) {
                    if (list.get(j) >= minOrMax) {
                        minOrMax = list.get(j);
                        index = j;
                    }
                }
            }
            list.set(index, list.get(i));
            list.set(i, minOrMax);
        }
        return list;
    }
}

