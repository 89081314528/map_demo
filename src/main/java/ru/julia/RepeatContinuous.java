package ru.julia;
/**
 * есть массив с числами. могут быть повторения. найти число, которое повторяется наибольшее количество раз
 * число должно повторяться непрерывно
 */
import java.util.ArrayList;
import java.util.List;

public class RepeatContinuous {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(9);
        list.add(0);
        list.add(9);
        list.add(9);
        System.out.println(list);
        printPepeat(list);
    }
    public static void printPepeat(List<Integer> list) {
        List<Number> numbers = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1)) {
                count = count + 1;
                numbers.add(new Number(list.get(i), count));
            } else {
                count = 1;
            }
        }
        int max = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).getNumberOfTimes() >= max) {
                max = numbers.get(i).getNumberOfTimes();
            }
        }
        List<Number> numberMaxRepeat = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).getNumberOfTimes() == max) {
                numberMaxRepeat.add(numbers.get(i));
            }
        }
        for (int i = 0; i < numberMaxRepeat.size(); i++) {
            System.out.println("число " + (numbers.get(i).getNumber()) + " повторяется " + (numbers.get(i).getNumberOfTimes()) + " раза");
        }
    }
}
