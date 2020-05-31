package ru.julia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**task10 вариант2
 * в классе может не быть поле и конструктора, может быть только метод
 * параметром класса сделать map
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
