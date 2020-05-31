package
        ru.julia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 3 вариант
 * есть текст, нужно заменить слова на конкретные - всех птиц заменить на берд, животных на энимал
 * выделить настройки в отдельный класс
 */
public class Task11 {
    public static void main(String[] args) {
        String text = "Птички- синички уснули в саду, коровки дают молоко, лошадки говорят игого";
        List<Animal> settings = new ArrayList<>();
        settings.add(new Animal("","bird"));
        settings.add(new Animal("","animal"));
        settings.add(new Animal("","animal"));

    }

    public static String deletePunctuationMarks(String text) {
        return text.replaceAll("\\.", "").replaceAll(",", "").
                replaceAll("!", "").replaceAll("\\?", "").replaceAll("\\-", "");
    }

    public static List<String> listOfWords(String newStr) {
        return Arrays.asList(newStr.split(" "));
    }

    public static void printChange(String text) {
        String newText = deletePunctuationMarks(text);
        System.out.println(newText);
        List<String> list = listOfWords(newText);
        System.out.println(list);

    }
}