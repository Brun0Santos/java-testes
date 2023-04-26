package org.example.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Testes {
    public static void main(String[] args) {
        List<String> nomes = new LinkedList<>();
        nomes.add("Bruno");
        nomes.add("Jose");
        nomes.add("Josiel");
        nomes.add("Samuel");
        nomes.add("Josiel");
        System.out.println(nomes);

        String seiNao = "12";
        Double idade = Double.valueOf(12);//autoboxing

        System.out.println(Integer.parseInt(seiNao));
        System.out.println(Double.parseDouble(seiNao));

//
        System.out.println(idade);

    }
}
