package org.example.exceptions;

public class TesteConexao {
    public static void main(String[] args) {
        Conexao conexao = null;
        try {
            conexao = new Conexao();
            conexao.lendoDados();
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        } finally {
            assert conexao != null;
            conexao.fechandoConexao();
        }

    }
}
