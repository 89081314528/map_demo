package ru.julia;
/**
 * используя set, без создания нового листа и копий
 * четные вперед нечетные назад
 * 1) для пузырьков - по возрастанию и убыванию, используя интерфейс
 */

import java.util.ArrayList;
import java.util.List;

public class DataSortedBySelection4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(-3);
        list.add(6);
        list.add(5);
        list.add(19);
        list.add(10);
        System.out.println(list);
        AscendingOrder ascendingOrder = new AscendingOrder();
        DescendingOrder descendingOrder = new DescendingOrder();
        OddOrder oddOrder = new OddOrder();
//        EvenOrder evenOrder = new EvenOrder();
        System.out.println(dataSorted(list, ascendingOrder));
        System.out.println(dataSorted(list, new EvenOrder()));
    }

    public static List<Integer> dataSorted(List<Integer> list, Order order) {
        for (int i = 0; i < list.size(); i++) {
            Integer minOrMax = list.get(i);
            int index = i;
            for (int j = i; j < list.size(); j++) {
                    if (order.isRight(list.get(j), minOrMax)) {
                        minOrMax = list.get(j);
                        index = j;
                    }
            }
            list.set(index, list.get(i));
            list.set(i, minOrMax);
        }
        return list;
    }
}

