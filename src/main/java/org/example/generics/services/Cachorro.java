package org.example.generics.services;

public class Cachorro implements Animal {
    private String name;

    public Cachorro(String name) {
        this.name = name;
    }

    @Override
    public String rugido() {
        return "Latindo como um cachorro";
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "name='" + name + '\'' +
                '}';
    }
}
