package org.example.abstracao.teste;

import org.example.abstracao.dominio.Desenvolvedor;
import org.example.abstracao.dominio.Gerente;

public class Funcionario1 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Lucas", 210.2);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Bruno", 210.2);
        desenvolvedor.imprimeMensagem();
        gerente.imprimeMensagem();

        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
