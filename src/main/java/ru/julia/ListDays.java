package ru.julia;

import java.util.ArrayList;
import java.util.List;

public class ListDays {
    private final List<Day> listDays;

    public ListDays() {
        listDays = new ArrayList<Day>();
        listDays.add(new Day(01,"первое"));
        listDays.add(new Day(02,"второе"));
        listDays.add(new Day(03,"третье"));
        listDays.add(new Day(04,"четвертое"));
        listDays.add(new Day(05,"пятое"));
    }

    public List<Day> getListDays() {
        return listDays;
    }
    public String nameOfDay(Integer day) {
        String nameOfDay = "";
        for (int i = 0; i < listDays.size(); i++) {
            if(listDays.get(i).getNumberOfDay().equals(day)) {
                nameOfDay = listDays.get(i).getNameOfDay();
            }
        }
        return nameOfDay;
    }
}
