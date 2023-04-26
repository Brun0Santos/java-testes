package org.example.optionalUso;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

public class Testes {
    public static void main(String[] args) {

        Optional<String> optionalS = Optional.ofNullable(null);

        String mesaDeCadeira = optionalS.orElse("Mesa de cadeira");

        System.out.println(mesaDeCadeira);
        LocalDateTime dataCriacao = LocalDateTime.now();
        System.out.println(dataCriacao);

//        if (optionalS.isPresent()){
//            System.out.println(optionalS.get());
//        } else {
//            System.out.println("nao existe valor");
//        }
    }
}
