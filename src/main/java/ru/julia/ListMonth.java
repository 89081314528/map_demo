package ru.julia;

import java.util.ArrayList;
import java.util.List;

public class ListMonth {
    private final List<Month> listMonth;

    public ListMonth() {
        listMonth = new ArrayList<Month>();
        listMonth.add(new Month(01,"января"));
        listMonth.add(new Month(02,"февраля"));
        listMonth.add(new Month(03,"марта"));
        listMonth.add(new Month(04,"апреля"));
        listMonth.add(new Month(05,"мая"));
        listMonth.add(new Month(06,"июня"));
    }

    public List<Month> getListMonth() {
        return listMonth;
    }
    public String nameOfMonth(Integer month) {
        String nameOfMonth = "";
        for (int i = 0; i < listMonth.size(); i++) {
            if(listMonth.get(i).getNumberOfMonth().equals(month)) {
                nameOfMonth = listMonth.get(i).getNameOfMonth();
            }
        }
        return nameOfMonth;
    }
}
