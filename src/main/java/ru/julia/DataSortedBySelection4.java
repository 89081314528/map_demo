package ru.julia;
/**
 * используя set, без создания нового листа и копий
 * четные вперед нечетные назад
 * 1) для пузырьков - по возрастанию и убыванию, используя интерфейс
 * 2) создать класс персон с полями - имя фамилия номер паспорта зарплата
 * создать интерфейс  - статистикс - с двумя методами:
 * эдд - принимает персон
 * гет - возвращает число
 * сделать реализацию нитерфейса:
 * первая - считает среднюю зарплату
 * вторая считает среднюю женскую зарплату
 * третья среднюю мужскую зарплату
 * четвертая - общая сумма зп в месяц
 * Метод в мэйне, который собирает статистику. Он принимает лист персон и объект типа статистикс
 * потом вызываем гет - он должен показать статистику
 * внутри метода(из мэйна) нужно для каждого персона у статистикс вызвать метод эдд и туда передать персон
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

