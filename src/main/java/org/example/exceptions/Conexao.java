package org.example.exceptions;

public class Conexao {

    public Conexao() {
        System.out.println("Abrindo conexão");
        throw new IllegalStateException("Deu erro ao ler os dados no construtor");
    }

    public void lendoDados() {
        System.out.println("Lendo dados");
        throw new IllegalStateException("Deu erro ao ler os dados");
    }

    public void fechandoConexao() {
        System.out.println("Fechando a conexao");
    }

}
