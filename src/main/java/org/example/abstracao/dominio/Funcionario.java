package org.example.abstracao.dominio;

public abstract class Funcionario extends Pessoa {
    private String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.calcularBonus();
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public abstract void calcularBonus();

    @Override
    public void imprimeMensagem() {
        System.out.println("Imprimindo no " + this.getNome());
    }
}
