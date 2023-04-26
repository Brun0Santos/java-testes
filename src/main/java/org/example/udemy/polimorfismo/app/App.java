package org.example.udemy.polimorfismo.app;

import org.example.udemy.polimorfismo.funcionarios.Employee;
import org.example.udemy.polimorfismo.funcionarios.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        OutsourcedEmployee outsourcedEmployee;
        Employee employee;

        System.out.println("Quantos funcionarios deseja cadastrar ?");
        int employeeIn = scanner.nextInt();

        for (int x = 0; x < employeeIn; x++) {
            System.out.println("Employee #" + x + ":");
            System.out.println("Outsourced (Y/N)? ");
            char character = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.println("Name");
            String name = scanner.nextLine();

            System.out.println("Hours");
            int hours = scanner.nextInt();

            System.out.println("Value por Hour");
            double valuePorHour = scanner.nextDouble();

            if (character == 'Y') {
                System.out.println("Additional");
                double additional = scanner.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePorHour, additional));
            } else {
                employees.add(new Employee(name, hours, valuePorHour));
            }
        }

        for (Employee ee : employees) {
            ee.payment();
            System.out.println(ee.getName() + ee.payment());
        }

    }
}
