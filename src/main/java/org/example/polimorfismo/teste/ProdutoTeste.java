package org.example.polimorfismo.teste;

import org.example.polimorfismo.dominio.Computador;
import org.example.polimorfismo.dominio.Tomate;
import org.example.polimorfismo.servico.CalculadoraImpostos;

public class ProdutoTeste {
    public static void main(String[] args) {
        Computador computador = new Computador("Mac 10", 220.00);
        Tomate tomate = new Tomate("vermelho", 10.00);

        System.out.println( computador.aplicarTaxa());
        tomate.aplicarTaxa();

        CalculadoraImpostos.calcularImpostoComputador(computador);


    }
}
