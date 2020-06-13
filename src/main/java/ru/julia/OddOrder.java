package ru.julia;

public class OddOrder implements Order {
    @Override
    public boolean isRight(Integer a, Integer b) {
        if (a % 2 == 0 && b % 2 != 0) {
            return false;
        } else {
            return true;
        }
    }
}
