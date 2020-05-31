package ru.julia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**task10 вариант2
 * в классе может не быть поле и конструктора, может быть только метод
 * 1) создать лист с настройками в мэйне
 * 2) параметром класса сделать лист Объектов с 2 полями - название животного  и то, на что его нужно заменить
 * 3) в конструкторе преобразовать лист в мапу
 * 4) использовать мапу внутри метода
 */

public class ChangeAnimal {
    private final
    Map<String, String> change;

    public ChangeAnimal(Map<String, String> change) {
        this.change = change;
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
