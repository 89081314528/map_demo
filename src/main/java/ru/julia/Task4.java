package ru.julia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * текст - посчитать количество вхождений каждого слова
 * метод который убирает знаки пунктуации
 * метод который принимает строку и возвращает лист со словами в этой строке
 * метод который принимает лист строк и возвращает мапу с количеством вхождений этих строк
 * сделать с одним циклом, завести переменную, в которую записывать начало слова
 */
public class Task4 {
//    public static void main(String[] args) {
//        String str = "Я научусь говорить слово прокрастинация!!!";
//        System.out.println(listOfWords(str));
//        List<String> strings = new ArrayList<>();
//        strings.add("прокрастинация");
//        strings.add("простоничегонеделание");
//        strings.add("отдых");
//        strings.add("нельзядоверятьпсихологам");
//        strings.add("прокрастинация");
//        System.out.println(numberOfString(strings).get("прокрастинация"));
//        System.out.println(numberOfString(strings).get("отдых"));
//        System.out.println(numberOfString(listOfWords(str)).get("Я"));
//    }

//    public static Map<String, Integer> numberOfString(List<String> strings) {
//        Map<String, Integer> numberOfString = new HashMap<String, Integer>();
//        for (int i = 0; i < strings.size(); ++i) {
//            String key = strings.get(i);
//            if (numberOfString.containsKey(key)) {
//                numberOfString.put(key, (numberOfString.get(key) + 1));
//            } else {
//                numberOfString.put(key, 1);
//            }
//        }
//        return numberOfString;
//    }

//    public static List<String> listOfWords(String str) {
//        String newStr = deletePunctuationMarks(str);
//        List<String> words = new ArrayList<>();
//        String word = "";
//        for (int i = 0; i < newStr.length(); i++) {
//            for (int j = i + 1; j < newStr.length(); j++) {
//                if (newStr.substring(j, j + 1).equals(" ")) {
//                    word = newStr.substring(i, j);
//                    System.out.println(word);
//                    words.add(word);
//                    i = j;
//                    break;
//                } else if (j == (newStr.length() - 1)) {
//                    word = newStr.substring(i, j + 1);
//                    System.out.println(word);
//                    words.add(word);
//                    i = j;
//                    break;
//                }
//            }
//        }
//        return words;
//    }

    //    public static String deletePunctuationMarks(String text) {
//        String newText = "";
//        for (int i = 0; i < text.length(); i++) {
//            if (text.substring(i, i + 1).equals(".") || text.substring(i, i + 1).equals(",")
//                    || text.substring(i, i + 1).equals("!")) {
//            } else {
//                newText = newText + text.substring(i, i + 1);
//            }
//        }
//        return newText;
//    }
    public static void main(String[] args) {
        String text = "I want, to live live in Obninsk!!!!!!!!!!";
        System.out.println(deletePunctuationMarks(text));
        System.out.println(listOfWords(text));
        System.out.println(mapWithNumberOfString(text).get("live"));
    }

    public static String deletePunctuationMarks(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) == '!') || (text.charAt(i) == '.') || (text.charAt(i) == ',') ||
                    (text.charAt(i) == '?')) {
            } else {
                newText = newText + text.charAt(i);
            }
        }
        return newText;
    }

    public static List<String> listOfWords(String text) {
        String newText = deletePunctuationMarks(text);
        List<String> list = new ArrayList<>();
        int start = 0;
        int end;
        for (int i = 0; i < newText.length(); i++) {
            if (newText.charAt(i) == ' ') {
                end = i;
                list.add(newText.substring(start, end));
                start = end + 1;
                i = end;
            }
            if (i == (newText.length() - 1)) {
                end = i;
                list.add(newText.substring(start, end + 1));
            }
        }
        return list;
    }

    public static Map<String, Integer> mapWithNumberOfString(String text) {
        List<String> listOfWords = listOfWords(text);
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < listOfWords.size(); i++) {
            String key = listOfWords.get(i);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        return map;
    }
}
