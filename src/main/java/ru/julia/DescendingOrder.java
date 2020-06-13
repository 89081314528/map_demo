package ru.julia;

public class DescendingOrder implements Order {
    @Override
    public boolean isRight(Integer a, Integer b) {
        if (a >= b) {
            return true;
        } else {
            return false;
        }
    }
}