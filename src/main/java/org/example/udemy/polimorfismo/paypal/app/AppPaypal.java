package org.example.udemy.polimorfismo.paypal.app;

import org.example.udemy.polimorfismo.paypal.entities.Contract;
import org.example.udemy.polimorfismo.paypal.services.ContractService;
import org.example.udemy.polimorfismo.paypal.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppPaypal {
    public static void main(String[] args) {

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate dateNow = LocalDate.parse("24/04/2022", formatter);
//
//        Contract contract = new Contract(1128, dateNow, 600.00);
//        ContractService contractService = new ContractService(new PaypalService());
//
//        contractService.processContract(contract, 3);
//
//        System.out.println(contract.getInstallment());

        List<String> myArray = new ArrayList<>();
        List<String> strings = List.of("Gelo", "Piso", "Teclado");

        myArray.add( "Teclado de computador");

        System.out.println(myArray);


    }
}
