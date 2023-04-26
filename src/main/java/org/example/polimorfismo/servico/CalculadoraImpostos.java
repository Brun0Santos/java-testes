package org.example.polimorfismo.servico;

import org.example.polimorfismo.dominio.Computador;
import org.example.polimorfismo.dominio.Produto;
import org.example.polimorfismo.dominio.Tomate;

public class CalculadoraImpostos {

    public static void calcularImpostoComputador(Produto produto){
        double imposto = produto.aplicarTaxa();
        System.out.println("Taxa de " + imposto + " sendo aplicada");
        System.out.println("Nome do computador " + produto.getNome());
        System.out.println("Valor do computador " + produto.getValor());
        if (produto instanceof Tomate tomate){
            System.out.println("Aplicando a regra de tomate");
            tomate.aplicarTaxa();
        }


    }
}
