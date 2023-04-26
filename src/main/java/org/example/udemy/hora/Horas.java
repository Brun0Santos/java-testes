package org.example.udemy.hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Horas {
    public static void main(String[] args) {


        Calendar datas = Calendar.getInstance();

        int ano = datas.get(Calendar.HOUR_OF_DAY);
        System.out.println("Estamos no mes de " + ano);
//        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
//
//
//        LocalDate time1 = LocalDate.now();
//        LocalDateTime time2 = LocalDateTime.now();
//        LocalDateTime time3 = LocalDateTime.parse("2022-04-12T13:44:23");
//        LocalDateTime ontem = time3.minusDays(7);
//
//
//        System.out.println(time1);
//        System.out.println(time2);
//        System.out.println(time3.format(fmt2));
//        System.out.println(ontem.format(fmt2));
//
//        LocalDateTime vencimentoBoleto = time2.plusDays(2);
//
//        Duration resultDays = Duration.between(time2, vencimentoBoleto);
//
//        Duration result = Duration.between(time3, ontem);
//        System.out.println(result.toDays());
//
//        System.out.println(vencimentoBoleto.format(fmt2));
//        System.out.println("Quantos dias para o vencimento do boleto? " + resultDays.toDays());


//        LocalDate dc = LocalDate.now();
//        LocalDateTime dc1 = LocalDateTime.now();
//        Instant is = Instant.now();
//
//        LocalDate newFuso = LocalDate.parse("2022-04-21");
//        Instant newInstat = Instant.parse("2023-05-21T09:33:12-03:00");
//        LocalDate dateLocale = LocalDate.parse("21/04/2023", fmt1);
//
//        LocalDate dateFormatter = LocalDate.parse("2022-03-03");



    }
}
