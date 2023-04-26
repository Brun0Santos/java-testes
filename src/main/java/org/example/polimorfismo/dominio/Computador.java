package org.example.polimorfismo.dominio;

public class Computador extends Produto {
    private static final double VALOR_IMPOSTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double aplicarTaxa() {
        System.out.println("Calculando o valor do computador");
        return this.getValor() * VALOR_IMPOSTO;
    }
}
