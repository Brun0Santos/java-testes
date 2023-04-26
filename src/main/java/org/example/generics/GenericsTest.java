package org.example.generics;

import org.example.generics.services.Animal;
import org.example.generics.services.Cachorro;
import org.example.generics.services.Gato;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        PrintService<String> printService = new PrintService<>();

        printService.addValueToList("Jorge");
        printService.addValueToList("Lucas");
//
//        printService.addValueToList(3);
//        printService.addValueToList(2);
//        printService.addValueToList(31);

        printService.printValues();


        String value = printService.getFirstValue();

        printService.getFirstValue();

        System.out.println("First Value " + value);

        List<?> objects = new ArrayList<>();

        List<Integer> integers = new ArrayList<>();

        objects = integers;

        List<Animal> animais = new ArrayList<>();
        List<Cachorro> cachorros = new ArrayList<>();

        Animal ted = new Gato("Ted");
        Animal bob = new Gato("Bob");
        Animal zex = new Gato("Zex");

        Cachorro piz = new Cachorro("Piz");
        Animal buz = new Cachorro("Buz");
        Animal blue = new Cachorro("Blue");

        animais.add(ted);
        animais.add(bob);
        animais.add(zex);
        animais.add(piz);
        animais.add(buz);
        animais.add(blue);

        cachorros.add(piz);



        printList(animais);
        System.out.println("======================");
        printList(cachorros);

    }

    public static void printList(List<? extends Animal> list) {
        list.forEach(System.out::println);
    }
}
