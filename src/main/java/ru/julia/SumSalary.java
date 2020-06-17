package ru.julia;

import java.util.ArrayList;
import java.util.List;

public class SumSalary implements Statistic{
    private final List<PersonForStatistics> list;

    public SumSalary() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(PersonForStatistics person) {
        list.add(person);
    }

    @Override
    public Integer get() {
        Integer sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i).getSalary();
        }
        return sum;
    }
}
