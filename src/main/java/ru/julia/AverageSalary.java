package ru.julia;

import java.util.ArrayList;
import java.util.List;

public class AverageSalary implements Statistic{

    @Override
    public void add(PersonForStatistics person) {
        List<PersonForStatistics> persons = new ArrayList<>();
        persons.add(person);
    }

    @Override
    public Integer get(List<PersonForStatistics> list) { // возвращает среднюю зп
        Integer sum = 0;
        Integer average = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i).getSalary();
        }
        average = sum / list.size();
        return average;
    }
}
