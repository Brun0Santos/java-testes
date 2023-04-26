package org.example.alura.testes;

import org.example.alura.testes.Aula;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestaListaAula {
    public static void main(String[] args) {
        Aula java = new Aula("Fundamentos de Java", 20);
        Aula kotlin = new Aula("Aprendndo fundamentos de kotlin", 40);
        Aula ts = new Aula("Relacionamento entre listas", 30);

        List<Aula> aulas = new ArrayList<>();
        aulas.add(java);
        aulas.add(kotlin);
        aulas.add(ts);

        //aulas.sort((a1, a2) -> Integer.compare(a1.getTempo(), a2.getTempo()));

        aulas.sort(Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);

    }
}
