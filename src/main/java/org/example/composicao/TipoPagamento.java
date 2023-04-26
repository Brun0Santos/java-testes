package org.example.composicao;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularPagamento(double valor) {
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double calcularPagamento(double valor) {
            return valor * 0.2;
        }
    };


    public abstract double calcularPagamento(double valor);
}
