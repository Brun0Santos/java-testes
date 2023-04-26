package org.example.polimorfismo.teste;

import org.example.polimorfismo.dominio.Computador;
import org.example.polimorfismo.dominio.Produto;
import org.example.polimorfismo.dominio.Tomate;
import org.example.polimorfismo.servico.CalculadoraImpostos;

public class ProdutoTeste1 {
    public static void main(String[] args) {
        Produto produto = new Computador("Hp", 220);
        Produto tomato = new Tomate("Vegano", 20);
        CalculadoraImpostos.calcularImpostoComputador(produto);
        System.out.println("========================");
        CalculadoraImpostos.calcularImpostoComputador(tomato);
    }

}
