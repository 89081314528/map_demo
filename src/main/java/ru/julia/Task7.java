package ru.julia;

/**
 * 0-5 мало, 6-10 нормально, 10-20 толпа, 21-50 тьма, 51-200 легион. Объект - текст и два поля
 * для количества
 */
public class Task7 {
    public static void main(String[] args) {
        MassiveSize a = new MassiveSize();
        System.out.println(a.size(20));
        System.out.println(a.getSizes().get(2).getSize());


    }
}
