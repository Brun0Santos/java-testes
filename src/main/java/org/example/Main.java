package org.example;

import org.example.composicao.Endereco;
import org.example.composicao.Pessoa;
import org.example.composicao.TipoPagamento;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Sao luis", "Fe em Deus", "rua boa vista");

        Pessoa pessoa = new Pessoa("Bruno", "Santos", 12, endereco, TipoPagamento.CREDITO);
        System.out.println(TipoPagamento.CREDITO.calcularPagamento(20));

        System.out.println(pessoa);

    }
}