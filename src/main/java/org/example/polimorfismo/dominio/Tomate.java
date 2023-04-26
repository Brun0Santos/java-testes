package org.example.polimorfismo.dominio;

import org.example.polimorfismo.dominio.Produto;

public class Tomate extends Produto {
    private static final double VALOR_IMPOSTO = 0.11;
    private String dataValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double aplicarTaxa() {
        System.out.println("Calculando o valor do tomate");
        return this.getValor() * VALOR_IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
