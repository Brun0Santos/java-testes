package org.example.interfaces.teste;

import org.example.interfaces.DataBaseLoader;
import org.example.interfaces.DataLoader;

public class DataLoadeTeste {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        dataBaseLoader.imprime();
        dataBaseLoader.usandoOImprimeDaInterface();

        DataLoader.usandoMetodoEstaticoDentroDaInterface();
    }
}
