package org.example.arrays.conta;

public class Conta {
    private String nome;
    private int agencia;
    private int numero;

    public Conta(String nome, int agencia, int numero) {
        this.nome = nome;
        this.agencia = agencia;
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.numero = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", agencia=" + agencia +
                ", numero=" + numero +
                '}';
    }
}
