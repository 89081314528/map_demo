package ru.julia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1) создать лист с настройками в мэйне
 * 2) параметром класса сделать мапу
 * 3) в конструкторе преобразовать лист в мапу
 * 4) использовать мапу внутри метода
 */
public class ChangeAnimal2 {
    private final Map<String, String> change;

    public ChangeAnimal2(List<Animal> listSettings) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < listSettings.size(); i++) {
            map.put(listSettings.get(i).animal, listSettings.get(i).change);
        }
        this.change = map;
    }
    public void change(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (change.containsKey(list.get(i))) {
                newList.add(change.get(list.get(i)));
            } else
                newList.add(list.get(i));
        }
        System.out.println(newList);
    }
}
