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
        System.out.println(list);
    }
    public static List<Integer> dataSorted(List<Integer> list) {
        List<Integer> copyList = new ArrayList<>(list);
        List<Integer> newList = new ArrayList<>();
        for (int a = 0; a < copyList.size(); ) {
            int minIndex = 0;
            Integer min = copyList.get(0);
            if (copyList.size() > 0) {
                for (int i = 0; i < copyList.size(); i++) {
                    if (copyList.get(i) <= min) {
                        min = copyList.get(i);
                        minIndex = i;
                    }
                }
                newList.add(min);
                copyList.remove(minIndex);
            } else {
                return newList;
            }
        }
        return newList;
    }
}
