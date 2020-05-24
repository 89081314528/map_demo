package ru.julia;

public class Size {
    private final String size;
    private final Integer start;
    private final Integer end;

    public Size(String size, Integer start, Integer end) {
        this.size = size;
        this.start = start;
        this.end = end;
    }

    public String getSize() {
        return size;
    }

    public Integer getStart() {
        return start;
    }

    public Integer getEnd() {
        return end;
    }
}
