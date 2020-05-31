package ru.julia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * в классе может не быть поле и конструктора, может быть только метод
 * 1) создать лист с настройками в мэйне
 * 2) параметром класса сделать лист Объектов с 2 полями - название животного  и то, на что его нужно заменить
 * 3) в конструкторе преобразовать лист в мапу
 * 4) использовать мапу внутри метода
 */

public class ChangeAnimal {
    private final List<Animal> list;

    public ChangeAnimal(List<Animal> list) {
        this.list = list;
        Map<String, String> mapAnimals = new HashMap<String, String>();
        for (int i = 0; i < list.size(); ++i) {
            mapAnimals.put(list.get(i).animal, list.get(i).change);
        }
    }

    public List<Animal> getList() {
        return list;
    }

    public List<String> changeAnimal(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("синички")) {
                newList.add("bird");
            } else if (list.get(i).equals("коровки") || list.get(i).equals("лошадки")) {
                newList.add("animal");
            } else {
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}
