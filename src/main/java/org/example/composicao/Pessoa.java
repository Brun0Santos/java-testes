package org.example.composicao;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private Endereco endereco;
    private TipoPagamento tipoPagamento;


    public Pessoa(String nome, String sobrenome, int idade, Endereco endereco, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.endereco = endereco;
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", endereco=" + endereco +
                '}';
    }
}