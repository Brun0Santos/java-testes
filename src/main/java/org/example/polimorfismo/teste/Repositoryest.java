package org.example.polimorfismo.teste;

import org.example.polimorfismo.repository.DataRepository;
import org.example.polimorfismo.servico.RepositorioBancoService;
import org.example.polimorfismo.servico.RepositorioService;

public class Repositoryest {
    public static void main(String[] args) {
        DataRepository repository = new RepositorioService();
        repository.salvar();
    }
}
