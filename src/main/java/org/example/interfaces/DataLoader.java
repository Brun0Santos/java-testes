package org.example.interfaces;

// nao é preciso adicionar o public abstract, pois todas as interfaces já tem isso implementado
public interface DataLoader {
    void imprime();

    default void usandoOImprimeDaInterface() {
        System.out.println("Usando o print do default");
    }

    static void usandoMetodoEstaticoDentroDaInterface() {
        System.out.println("dentro da interface com o metodo static");
    }

}
