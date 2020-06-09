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
        System.out.println(dataSorted(list));
    }

    public static List<Integer> dataSorted(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            Integer min = list.get(i);
            int minIndex = i;
            for (int j = i; j < list.size(); j++) {
                if(list.get(j) <= min) {
                    min = list.get(j);
                    minIndex = j;
                }
            }
            list.set(minIndex,list.get(i));
            list.set(i,min);

        }
        return list;
    }
}
