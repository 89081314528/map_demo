package ru.julia;

public class PersonForStatistics {
    private final String name;
    private final String surname;

    public PersonForStatistics(String name, String surname, String gender, Integer salary) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.salary = salary;
    }

    private final String gender;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public Integer getSalary() {
        return salary;
    }

    private final Integer salary;
}
