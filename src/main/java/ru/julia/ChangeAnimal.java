package ru.julia;

import java.util.ArrayList;
import java.util.List;

public class ChangeAnimal {
    public final List<String> list;

    public List<String> getList() {
        return list;
    }

    public ChangeAnimal(List<String> list) {
        this.list = list;
    }
    public List<String> changeAnimal (List<String> list) {
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
