package org.example.udemy.composicao.entities;

import org.example.udemy.composicao.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContracts> contracts = new ArrayList<>();

    public Worker() {

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContracts> getContracts() {
        return contracts;
    }

    public void addContract(HourContracts contract) {
        this.contracts.add(contract);
    }

    public void removeContract(HourContracts contract) {
        this.contracts.remove(contract);
    }

    public double income(int year, int month) {
        double resultSum = this.baseSalary;
        for (HourContracts contracts : this.contracts) {
            if (contracts.getDate().getMonth().getValue() == month && contracts.getDate().getYear() == year) {
                resultSum += contracts.totalValue();
            }
        }
        return resultSum;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                ", contracts=" + contracts +
                '}';
    }
}
