package ru.julia;

import java.util.ArrayList;
import java.util.List;

public class AverageSalary implements Statistic{
    private final List<PersonForStatistics> list;

    public List<PersonForStatistics> getList() {
        return list;
    }

    public AverageSalary(List<PersonForStatistics> list) {
        this.list = list;
    }

    @Override
    public void add(PersonForStatistics person) {
        list.add(person);
    }

    @Override
    public Integer get() { // возвращает среднюю зп
        Integer sum = 0;
        Integer average = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i).getSalary();
        }
        average = sum / list.size();
        return average;
    }
}
