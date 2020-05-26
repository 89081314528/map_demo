package ru.julia;

public class Month {
    private final Integer numberOfMonth;
    private final String nameOfMonth;

    public Month(Integer numberOfMonth, String nameOfMonth) {
        this.numberOfMonth = numberOfMonth;
        this.nameOfMonth = nameOfMonth;
    }

    public Integer getNumberOfMonth() {
        return numberOfMonth;
    }

    public String getNameOfMonth() {
        return nameOfMonth;
    }
}
