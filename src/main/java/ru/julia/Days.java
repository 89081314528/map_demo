package ru.julia;
import java.util.HashMap;
import java.util.Map;

public class Days {
    private final Map<Integer, String> mapDays;

    public Days() {
        mapDays = new HashMap<Integer, String>();
        mapDays.put(01,"первое");
        mapDays.put(02,"второе");
        mapDays.put(03,"третье");
        mapDays.put(04,"четвертое");
        mapDays.put(05,"пятое");
    }

    public String nameOfDay(Integer day) {
        String nameOfDay = mapDays.get(day);
        return nameOfDay;
    }
}
