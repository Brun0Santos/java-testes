package org.example.udemy.polimorfismo.carros.services;

public class URSSTaxService implements TaxService{

    @Override
    public Double tax(Double amount) {
        if (amount <= 100.00) {
            return amount * 0.3;
        } else {
            return amount * 0.16;
        }
    }
}
