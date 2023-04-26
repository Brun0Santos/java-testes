package org.example.polimorfismo.servico;

import org.example.polimorfismo.repository.DataRepository;

public class RepositorioMemoriaService implements DataRepository {

    @Override
    public void salvar() {
        System.out.println("Salvando na memoria");
    }
}
