package org.example.udemy.composicao.entities;

import java.time.LocalDate;
import java.util.Date;

public class HourContracts {
    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;

    public HourContracts() {
    }

    public HourContracts(LocalDate date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue() {
        return this.valuePerHour * this.hours;
    }

    @Override
    public String toString() {
        return "HourContracts{" +
                "date=" + date +
                ", valuePerHour=" + valuePerHour +
                ", hours=" + hours +
                '}';
    }
}
