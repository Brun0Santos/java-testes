package org.example.udemy.polimorfismo.funcionarios;

public  class Employee {
    private String name;
    private Integer hours;
    private Double valuePerHour;

    public Employee() {

    }

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return this.name;
    }

    public Integer getHours() {
        return hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public double payment() {
        return hours * valuePerHour;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", " + payment() +
                '}';
    }


}
