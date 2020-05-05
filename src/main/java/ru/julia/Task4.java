package ru.julia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * метод который убирает знаки пунктуации
 * метод который принимает строку и возвращает лист со словами в этой строке
 * метод который принимает лист строк и возвращает мапу с количеством вхождений этих строк
 * сделать с одним циклом, завести переменную, в которую записывать начало слова
 */
public class Task4 {
    public static void main(String[] args) {
        String str = "Я научусь говорить слово прокрастинация!!!";
        System.out.println(listOfWords(str));
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

    public static List<String> listOfWords(String str) {
        String newStr = deletePunctuationMarks(str);
        List<String> words = new ArrayList<>();
        String word = "";
        for (int i = 0; i < newStr.length(); i++) {
            for (int j = i + 1; j < newStr.length(); j++) {
                if (newStr.substring(j, j + 1).equals(" ")) {
                    word = newStr.substring(i, j);
                    System.out.println(word);
                    words.add(word);
                    i = j;
                    break;
                } else if (j == (newStr.length() - 1)) {
                    word = newStr.substring(i, j + 1);
                    System.out.println(word);
                    words.add(word);
                    i = j;
                    break;
                }
            }
        }
        return words;
    }

    public static String deletePunctuationMarks(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.substring(i, i + 1).equals(".") || text.substring(i, i + 1).equals(",")
                    || text.substring(i, i + 1).equals("!")) {
            } else {
                newText = newText + text.substring(i, i + 1);
            }
        }
        return newText;
    }
}
