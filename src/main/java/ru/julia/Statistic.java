package ru.julia;

import java.util.List;

public interface Statistic {
    void add(PersonForStatistics person);
    Integer get();
}
