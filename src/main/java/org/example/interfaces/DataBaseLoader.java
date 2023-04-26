package org.example.interfaces;

public class DataBaseLoader implements DataLoader{
    @Override
    public void imprime() {
        System.out.println("Imprimindooooo");
    }

    @Override
    public void usandoOImprimeDaInterface() {
        System.out.println("USando o imprime de dentro da classe");
    }

    static void usandoMetodoEstaticoDentroDaInterface() {
        System.out.println("dentro da interface com o metodo static");
    }
}
