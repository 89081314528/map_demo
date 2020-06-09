package ru.julia;

import java.util.ArrayList;
import java.util.List;

public class DataSortedBySelection2 {
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
        for (int i = list.size() - 1; i >= 0; i--) {
            Integer min = list.get(i);
            int minIndex = i;
            for (int j = i; j >= 0; j--) {
                if(list.get(j) <= min) {
                    min = list.get(j);
                    minIndex = j;
                }
            }
            list.remove(minIndex);
            list.add(min);
        }
        return list;
    }
}

