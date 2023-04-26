package org.example.udemy.hora;

import org.example.udemy.hora.Funcionario;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Funcionario funcionario;
        List<Funcionario> funcionarios = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos funcionarios vc deseja cadastrar ? ");
        int qtdFunc = sc.nextInt();

        for (int x = 0; x < qtdFunc; x++) {
            System.out.println("Funcionario #" + x);
            System.out.println("ID do funcionario? ");
            Integer id = sc.nextInt();

            sc.nextLine();

            System.out.println("Nome do funcionario ? ");
            String name = sc.nextLine();

            System.out.println("Salario do funcionario ? ");
            Double salary = sc.nextDouble();

            funcionarios.add(new Funcionario(id, name, salary));
        }

        System.out.println("Entre com o ID do funcionario q vc deseja aumentar");
        Integer idAchado = sc.nextInt();

        Optional<Funcionario> collect = funcionarios.stream().filter(person -> person.getId() == idAchado).findFirst();

        if (collect.isPresent()) {
            collect.get().setSalary(collect.get().getSalary() + 3);
        } else {
            System.out.println("funcionario nao encontrado");
        }
        System.out.println("Lista de funcionarios");
        funcionarios.forEach(System.out::println);
        sc.close();
    }
}
