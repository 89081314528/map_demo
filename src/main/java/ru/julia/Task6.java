package ru.julia;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.*;

/**
 * текст - посчитать количество вхождений каждого слова
 * без использования вложенных циклов и используя методы из task4:
 * метод который убирает знаки пунктуации
 * метод который принимает строку и возвращает лист со словами в этой строке
 * метод который принимает лист строк и возвращает мапу с количеством вхождений этих строк
 * Arrays.asList - преобразует массив в лист
 * split - делит по строку на подстроки, в зависимости от разделительного символа и создает массив строк
 * replaceAll - заменяет все символы в строке
 */
public class Task6 {
    public static void main(String[] args) {
        String text = "Я медленно становлюсь на колени и снимаю кофточку. Я все правильно сделала, " +
                "больше меня не уволят?";
        System.out.println(numberOfWords(text).get("Я"));
    }

    public static Map<String, Integer> numberOfWords(String text) {
        String newText = deletePunctuationMarks2(text);
        System.out.println(newText);
        List<String> words = listOfWords2(newText);
        System.out.println(words);
        Map<String, Integer> numberOfWords = numberOfString(words);
        return numberOfWords;
    }

    public static List<String> listOfWords(String newStr) {
        List<String> words = new ArrayList<>();
        String word = "";
        int startOfWord = 0;
        for (int i = 0; i < newStr.length(); i++) {
            if (newStr.substring(i, i + 1).equals(" ")) {
                word = newStr.substring(startOfWord, i);
                System.out.println(word);
                words.add(word);
                startOfWord = i + 1;
            } else if (i == (newStr.length() - 1)) {
                word = newStr.substring(startOfWord, i + 1);
                System.out.println(word);
                words.add(word);
                startOfWord = i + 1;
            }
        }
        return words;
    }

    public static List<String> listOfWords2(String newStr) {
        return Arrays.asList(newStr.split(" "));
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

    public static String deletePunctuationMarks(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.substring(i, i + 1).equals(".") || text.substring(i, i + 1).equals(",")
                    || text.substring(i, i + 1).equals("!") || text.substring(i, i + 1).equals("?")) {
            } else {
                newText = newText + text.substring(i, i + 1);
            }
        }
        return newText;
    }

    public static String deletePunctuationMarks2(String text) {
        return text.replaceAll("\\.", "").replaceAll(",","").
                replaceAll("!", "").replaceAll("\\?", "");
    }
}
