package ru.julia;

import java.util.List;

/**
 * 1) создать лист с настройками в мэйне
 * 2) параметром класса сделать лист Объектов с 2 полями - название животного  и то, на что его нужно заменить
 * 3) в конструкторе преобразовать лист в мапу
 * 4) использовать мапу внутри метода
 */
public class ChangeAnimal2 {
    private final List<Animal> list;

    public List<Animal> getList() {
        return list;
    }

    public ChangeAnimal2(List<Animal> list) {
        this.list = list;
    }
}
