package ru.julia;
import java.util.HashMap;
import java.util.Map;

public class Months {
    private final Map<Integer, String> mapMonth;

    public Months() {
        mapMonth = new HashMap<Integer, String>();
        mapMonth.put(01,"января");
        mapMonth.put(02,"февраля");
        mapMonth.put(03,"марта");
        mapMonth.put(04,"апреля");
        mapMonth.put(05,"мая");
        mapMonth.put(06,"июня");
    }

    public String nameOfMonth(Integer month) {
        String nameOfMonth = mapMonth.get(month);
        return nameOfMonth;
    }
}
