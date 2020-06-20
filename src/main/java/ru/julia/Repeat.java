package ru.julia;

import java.util.*;

/**
 * есть массив с числами. могут быть повторения. найти число, которое повторяется наибольшее количество раз
 * 2) число которое повторяется непрерывно
 * entrySet() - метод возвращает Set из Map.Entry Set<Map.Entry>
 *
 */

public class Repeat {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(9);
        list.add(7);
        list.add(9);
        list.add(9);
        repeat(list);
    }
    public static void repeat(List<Integer> list) {
        Map<Integer, Integer> map= new HashMap<Integer, Integer>();
        Integer max = 0;
        Integer key = null;
        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))) {
                map.put(list.get(i), map.get(list.get(i)) + 1);
                if (map.get(list.get(i)) > max) {
                    max = map.get(list.get(i));
                    key = list.get(i);
                }
            } else {
                map.put(list.get(i), 1);
            }
        }
        System.out.println("max = " + max);;
        System.out.println("key = " + key);
        for (Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());

        }
    }
}
