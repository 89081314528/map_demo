package ru.julia;

import java.util.*;

/**
 * Найти в массиве чисел ближайшее по модулю к десяти. Если одинаковые слева и справа,
 * выбрать то, которое слева. Десять не учитываем.
 */
public class NearTen2 {
    public static void main(String[] args) {
        NavigableSet <Integer> massive = new TreeSet();
        massive.add(2);
        massive.add(5);
        massive.add(10);
        massive.add(15);
        massive.add(20);


        Integer higher = massive.higher(10);
//        System.out.println(higher);
        Integer lower = massive.lower(10);
//        System.out.println(lower);
        if ((10 - lower) <= (higher - 10)){
            System.out.println("Ближайшее к десяти " + lower);
        } else {
            System.out.println("Ближайшее к десяти " + higher);
        }
    }
}
