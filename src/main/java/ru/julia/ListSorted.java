package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * метод, который принимает лист и возвращает, отсортировано он по возрастанию, или нет
 */
public class ListSorted {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(6);
        list.add(9);
        list.add(10);
        System.out.println(sorted(list));
    }
    public static boolean sorted(List<Integer> list) {
        Integer max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) >= max) {
                max = list.get(i);
            } else {
                return false;
            }
        }
        return true;
    }
}
