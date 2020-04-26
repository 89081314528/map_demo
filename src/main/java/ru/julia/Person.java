package ru.julia;

public class Person {
private final String name;
private final String surname;
private final Integer age;
private final Integer salary;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }

    public Person(String name, String surname, Integer age, Integer salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }
}
