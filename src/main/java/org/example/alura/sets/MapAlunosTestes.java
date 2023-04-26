package org.example.alura.sets;

import org.example.alura.testes.Aula;
import org.example.alura.testes.Curso;

import java.util.List;

public class MapAlunosTestes {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Curso de Java", "Nico stippet");
        javaColecoes.adiciona(new Aula("Dominando listas", 120));
        javaColecoes.adiciona(new Aula("spring boot", 130));

        Aluno a1 = new Aluno("Bruno Santos", 333);
        Aluno a2 = new Aluno("Levi Oliveira", 111);
        Aluno a3 = new Aluno("Samantha Gutemberg", 222);

        Aluno bruno = new Aluno("Bruno Santos", 333);

        javaColecoes.matriculaAluno(a1);
        javaColecoes.matriculaAluno(a2);
        javaColecoes.matriculaAluno(a3);

        javaColecoes.getAlunos().forEach(System.out::println);

        System.out.println(javaColecoes.buscarPorMatricula(222));


    }
}
