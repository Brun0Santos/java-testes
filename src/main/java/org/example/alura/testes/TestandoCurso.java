package org.example.alura.testes;

public class TestandoCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Curso de Java", "Nico stippet");
        javaColecoes.adiciona(new Aula("Curso de Javas", 120));
        javaColecoes.adiciona(new Aula("Curso de Kotlin", 30));

        System.out.println(javaColecoes.getAulas());
        System.out.println(javaColecoes.getTempoTotal());
    }
}
