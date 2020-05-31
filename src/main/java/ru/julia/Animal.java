package ru.julia;

public class Animal {
    public final String animal;
    public final String change;

    public Animal(String animal, String change) {
        this.animal = animal;
        this.change = change;
    }

    public String getAnimal() {
        return animal;
    }

    public String getChange() {
        return change;
    }

}
