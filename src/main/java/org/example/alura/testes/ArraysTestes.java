package org.example.alura.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArraysTestes {

    public static void main(String[] args) {
        List<String> cursosParaEstudar = new ArrayList<>();
        String aula1 = "Microservices";
        String aula2 = "Kotlin";
        String aula3 = "Java";

        cursosParaEstudar.add(aula1);
        cursosParaEstudar.add(aula2);
        cursosParaEstudar.add(aula3);

        cursosParaEstudar.remove(0);

        System.out.println(cursosParaEstudar);

        cursosParaEstudar.forEach(curso -> System.out.println("Curso " + curso));
        System.out.println("=======================");


        cursosParaEstudar.add("IDH estudos");
        cursosParaEstudar.add("Ambientes java");
        Collections.sort(cursosParaEstudar);
        System.out.println(cursosParaEstudar);
    }
}
