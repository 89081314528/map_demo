package ru.julia;

import java.util.HashMap;
import java.util.Map;

/**
 * map - отображение
 * главный признак массива - можно обратиться к i элементу, где i - это целое число. В массивах не может быть пропука
 * элементов
 * В мапе индексом может быть число, строка, класс и т. д. или Обджект, тогда туда можно подставлять все что угодно
 * В мапе указывается тип индекса и тип элементов
 * В мапе индекс называется ключом. Индекс - применяется там, где нет пропусков, а ключ - там где они есть.
 * В мапе как правило нет порядка
 * Мап - это отображение ключей на элементы
 * сделать элементами мапа объекты - фио, возраст, зарплата
 * */
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> salaries = new HashMap<String, Integer>();
        salaries.put("Julia", 60000);
        salaries.put("Ilya", 200000);
        salaries.put("Vasya", 100000);
        String name = "Julia";
        System.out.println(salaries.get(name));

        Map<String, Person> persons = new HashMap<String, Person>();
        Person julia = new Person("Julia", "Gordeeva", 35, 60000);
        Person ilya = new Person("Ilya", "Sazonov", 35, 100000);
        persons.put("Julia",julia);
        persons.put("Ilya",ilya);
        String name2 = null;
        System.out.println(persons.get("Julia").getAge());
        System.out.println(persons.containsKey("Petya"));
    }


}
