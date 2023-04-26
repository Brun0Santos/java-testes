package org.example.arrays;

import org.example.arrays.conta.Conta;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArraysDeReferencia {
    public static void main(String[] args) {

        Conta cp = new Conta("Bruno", 4444, 55);
        Conta cc = new Conta("Lucas", 2222, 33);
        Conta cp1 = new Conta("Samuel", 3333, 66);
        Conta cp2 = new Conta("Ana", 1616, 44);


        List<Conta> contas = new ArrayList<>(List.of(cp, cc, cp1, cp2));

        contas.forEach(System.out::println);

        System.out.println("===========================");

        contas.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

        contas.forEach(System.out::println);


    }
}

//class usandoOComparator implements Comparator<Conta> {
//    @Override
//    public int compare(Conta c1, Conta c2) {
//        return Integer.compare(c1.getNumero(), c2.getNumero());
//    }
//}

class comparandoNomesString implements Comparator<Conta> {
    @Override
    public int compare(Conta c1, Conta c2) {
        String nome1 = c1.getNome();
        String nome2 = c2.getNome();

        return nome1.compareTo(nome2);


    }
}