package org.example.abstracao.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + this.getNome() + '\'' +
                ", salario=" + this.getSalario() +
                '}';
    }

    @Override
    public void calcularBonus() {
        this.salario += this.salario * 0.5;
    }
}
