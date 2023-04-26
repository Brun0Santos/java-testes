package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    List<T> values = new ArrayList<>();

    public void addValueToList(T number) {
        values.add(number);
    }

    public T getFirstValue() {
        return values.get(0);
    }

    public void printValues() {
        System.out.println(values);
    }
}
