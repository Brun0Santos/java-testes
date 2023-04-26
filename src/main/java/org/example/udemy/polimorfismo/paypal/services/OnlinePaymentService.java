package org.example.udemy.polimorfismo.paypal.services;

public interface OnlinePaymentService {
    Double payment(Double amount);
    Double interest(Double amount, int months);
}
