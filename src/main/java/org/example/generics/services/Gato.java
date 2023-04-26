package org.example.generics.services;

import java.util.List;

public class Gato implements Animal {
    private String name;

    public Gato(String name) {
        this.name = name;
    }

    @Override
    public String rugido() {
        return "Miando como um gato";
    }

    @Override
    public String toString() {
        return "Gato{" +
                "name='" + name + '\'' +
                '}';
    }

}
