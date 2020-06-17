package ru.julia;

/**
 * создать класс персон с полями - имя фамилия пол зарплата
 * создать интерфейс  - статистикс - с двумя методами:
 * эдд - принимает персон
 * гет - возвращает число
 * сделать реализацию нитерфейса:
 * первая - считает среднюю зарплату
 * вторая считает среднюю женскую зарплату
 * третья среднюю мужскую зарплату
 * четвертая - общая сумма зп в месяц
 * Метод в мэйне, который собирает статистику. Он принимает лист персон и объект типа статистикс
 * потом вызываем гет - он должен показать статистику, например, среднюю зарплату
 * внутри метода(из мэйна) нужно для каждого персона у статистикс вызвать метод эдд и туда передать персон
 */

import java.util.ArrayList;
import java.util.List;

public class Statistics {
    public static void main(String[] args) {
        PersonForStatistics vasya = new PersonForStatistics("Vasyliy", "Kuznetsov", "m", 20000);
        PersonForStatistics petya = new PersonForStatistics("Petr", "Lebedev", "m", 50000);
        PersonForStatistics anya = new PersonForStatistics("Anya", "Kolganova", "f", 40000);
        PersonForStatistics lena = new PersonForStatistics("Lena", "Ivanova", "f", 10000);
        List<PersonForStatistics> list = new ArrayList<>();
        list.add(vasya);
        list.add(petya);
        list.add(anya);
        list.add(lena);
        Statistic averageSalary = new AverageSalary();
        Statistic averageFemaleSalary = new AverageFemaleSalary();
        Statistic averageMaleSalary = new AverageMaleSalary();
        Statistic sumSalary = new SumSalary();
        System.out.println(statistic(list, averageSalary));
        System.out.println(statistic(list, averageFemaleSalary));
        System.out.println(statistic(list, averageMaleSalary));
        System.out.println(statistic(list, sumSalary));

    }

    public static Integer statistic(List<PersonForStatistics> list, Statistic statistic) {
        for (int i = 0; i < list.size(); i++) {
            PersonForStatistics personForStatistics = list.get(i);
            statistic.add(personForStatistics);
        }
        return statistic.get();
    }
}
