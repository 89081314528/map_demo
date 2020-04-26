package ru.julia;

import java.util.HashMap;
import java.util.Map;

/**
 * есть мапа. ключ - имя, значение - интеджер. потом в переменной есть имя. понять по имени,
 * есть ли значение в мапе. потом изменить значение по этому ключу на 1 и распечатать
 */
public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("Julia", 35);
        ages.put("Ilya", 36);
        ages.put("Ira", 30);
        ages.put("Olya", 10);
        String name = "Ira";
        if (ages.containsKey(name)) {
            ages.put(name, (ages.get(name) + 1));
            System.out.println(ages.get(name));
        } else
            System.out.println("false");
    }
}
