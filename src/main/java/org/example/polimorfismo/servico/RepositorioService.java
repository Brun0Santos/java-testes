package org.example.polimorfismo.servico;

import org.example.polimorfismo.repository.DataRepository;

public class RepositorioService implements DataRepository {

    @Override
    public void salvar() {
        System.out.println("Salvando no banco de e passando na service");
    }
}
