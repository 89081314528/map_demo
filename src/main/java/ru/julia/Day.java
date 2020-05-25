package ru.julia;

public class Day {
    private final Integer numberOfDay;
    private final String nameOfDay;


    public Day(Integer numberOfDay, String nameOfDay) {
        this.numberOfDay = numberOfDay;
        this.nameOfDay = nameOfDay;
    }

    public Integer getNumberOfDay() {
        return numberOfDay;
    }

    public String getNameOfDay() {
        return nameOfDay;
    }
}
