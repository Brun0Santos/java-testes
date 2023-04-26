package org.example.alura.novidadeJava;

public class ExemploCurso {
    private String nomeCurso;
    private int qtdAlunos;

    public ExemploCurso(String nomeCurso, int qtdAlunos) {
        this.nomeCurso = nomeCurso;
        this.qtdAlunos = qtdAlunos;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    @Override
    public String toString() {
        return "ExemploCurso{" +
                "nomeCurso='" + nomeCurso + '\'' +
                ", qtdAlunos=" + qtdAlunos +
                '}';
    }
}
