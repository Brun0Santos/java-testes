package org.example.udemy.composicao;

import org.example.udemy.composicao.entities.Department;
import org.example.udemy.composicao.entities.HourContracts;
import org.example.udemy.composicao.entities.Worker;
import org.example.udemy.composicao.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Qual o nome do departamento ?");
        String department = scan.nextLine();

        System.out.println("Dados do trabalhador");

        System.out.println("Nome");
        String name = scan.nextLine();

        System.out.println("Nivel");
        String level = scan.nextLine();

        System.out.println("Salario base");
        Double salary = scan.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, new Department(department));

        System.out.println("Quantos contatos vc quer adicionar ?");
        int valorContrato = scan.nextInt();

        for (int x = 0; x < valorContrato; x++) {
            System.out.println("Data do contrato");
            String dateNoFormatter = scan.next();
            LocalDate date = LocalDate.parse(dateNoFormatter, fmt1);

            System.out.println("Valor por hora");
            double value = scan.nextDouble();
            System.out.println("Duração da hora");
            int hours = scan.nextInt();

            HourContracts contracts = new HourContracts(date, value, hours);

            worker.addContract(contracts);
        }

        System.out.println("Pesquisar por uma data especifica no formata MM/YYYY");
        String dateInput = scan.next();
        System.out.println(dateInput);

        int mes = Integer.parseInt(dateInput.substring(0, 2));
        int ano = Integer.parseInt(dateInput.substring(3));

        System.out.println(worker);
        System.out.println(worker.income(ano, mes));


        scan.close();
    }
}
