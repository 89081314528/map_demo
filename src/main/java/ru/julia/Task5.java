package ru.julia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * метод который принимает лист строк и возвращает мапу с количеством вхождений этих строк
 */
public class Task5 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("прокрастинация");
        strings.add("простоничегонеделание");
        strings.add("отдых");
        strings.add("нельзядоверятьпсихологам");
        strings.add("прокрастинация");
        System.out.println(numberOfString(strings).get("прокрастинация"));
        System.out.println(numberOfString(strings).get("отдых"));
    }

    public static Map<String, Integer> numberOfString(List<String> strings) {
        Map<String, Integer> numberOfString = new HashMap<String, Integer>();
        for (int i = 0; i < strings.size(); ++i) {
            String key = strings.get(i);
            if (numberOfString.containsKey(key)) {
                numberOfString.put(key, (numberOfString.get(key) + 1));
            } else {
                numberOfString.put(key, 1);
            }
        }
        return numberOfString;
    }

}
