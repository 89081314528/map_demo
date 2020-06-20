package ru.julia;

public class Number {
    public Number(Integer number, Integer numberOfTimes) {
        this.number = number;
        this.numberOfTimes = numberOfTimes;
    }

    private final Integer number;

    public Integer getNumber() {
        return number;
    }

    public Integer getNumberOfTimes() {
        return numberOfTimes;
    }

    private final Integer numberOfTimes;
}
