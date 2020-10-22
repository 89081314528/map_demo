package ru.julia;

import java.util.ArrayList;
import java.util.List;

public class NearTen {
    public static void main(String[] args) {
        Integer[] massive = {-100, 2, 8, 10, 15, 20};
        List<Integer> difference = new ArrayList<>();
        for (int i = 0; i < massive.length; i++) {
            difference.add(10 - massive[i]);
        }
        System.out.println(difference);
        List<Integer> nearLeft = new ArrayList<>();
        List<Integer> nearRight = new ArrayList<>();
        for (int i = 0; i < difference.size(); i++) {
            if (difference.get(i) > 0) {
                nearLeft.add(difference.get(i));
            }
            if (difference.get(i) < 0) {
                nearRight.add(difference.get(i));
            }
        }
        Integer left = minInList(nearLeft);
        Integer right = maxInList(nearRight);
        System.out.println("Ближайшее к десяти число из массива чисел меньше десяти: " + (10 - left));
        System.out.println("Ближайшее к десяти число из массива чисел больше десяти: " + (10 - right));
    Integer near = 0;

//    if(left == (right * (-1))) {
//        near = 10 - left;
//    }
    if (left < right * (-1)) {
        near = 10 - left;
    }
        if (left > right * (-1)) {
        near = 10 - right;
    } else {
            near = 10 - left;
        }
        System.out.println("Ближайшее к десяти число: " + near);
    }

    public static Integer minInList(List<Integer> list) {
        Integer min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static Integer maxInList(List<Integer> list) {
        Integer max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

}
