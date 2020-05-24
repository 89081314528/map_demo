package ru.julia;

import java.util.ArrayList;
import java.util.List;

public class MassiveSize {
    private final List<Size> sizes; // если стоит спецификатор файнал, то поле надо обязательно
    // инициализировать в конструкторе


    public MassiveSize() {
        sizes = new ArrayList<Size>(); // это инициализация поля в конструкторе.
        // this.sizes - всегда означает поле.
        // = sizes - если есть аргумент, то это аргумент. если нет аргумента, то это поле
        sizes.add(new Size("malo",0,5));
        sizes.add(new Size("tolpa",6,20));
        sizes.add(new Size("mnogo",21,100));
    }

    public List<Size> getSizes() {
        return sizes;
    }

    public String size(Integer a) {
        String result = "";
        for (int i = 0; i < sizes.size() ; i++) {
            int start = sizes.get(i).getStart();
            int end = sizes.get(i).getEnd();
            if (a >= start && a <= end) {
                result = sizes.get(i).getSize();
            } else if (a > end && (i == sizes.size() - 1)) {
                result = sizes.get(i).getSize();
            }
        }
        return result;
    }
}
