package ru.julia;

public class DescendingOrderForBubble implements Order{
    @Override
    public boolean isRight(Integer a, Integer b) {
        if (a < b) {
            return true;
        } else {
            return false;
        }
    }
}
