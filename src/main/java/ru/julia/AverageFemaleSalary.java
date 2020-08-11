package ru.julia;

import java.util.ArrayList;
import java.util.List;

public class AverageFemaleSalary implements Statistic{
    private final List<PersonForStatistics> list;

    public AverageFemaleSalary() {
        this.list = new ArrayList<>();// инициализация
    }

    @Override
    public void add(PersonForStatistics person) {
        list.add(person);
    }

    @Override
    public Integer get() {
        Integer sum = 0;
        Integer average = 0;
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getGender().equals("f")) {
                sum = sum + list.get(i).getSalary();
                count = count + 1;
            }
        }
        average = sum / count;
        return average;
    }
}
