package org.example.alura.sets;

import java.util.*;

public class AlunosSet {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();

        alunos.add("Bruno");
        alunos.add("Lucas");
        alunos.add("Felipe");
        alunos.add("Bernado");
        alunos.add("Leticia");
        alunos.add("Paulo");
        alunos.add("Leandro");
        alunos.add("Vinicius");
        alunos.add("Felipe");

        System.out.println(alunos);

//        alunos.forEach(System.out::println);
//
//        alunos.remove("Bruno");
//        System.out.println(alunos);
//
//        System.out.println(alunos.contains("Bernado"));
    }
}
