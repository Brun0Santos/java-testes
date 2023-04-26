package org.example.udemy.polimorfismo.paypal.services;

public class PaypalService implements OnlinePaymentService {
    @Override
    public Double payment(Double amount) {
        return amount * 0.2;
    }

    @Override
    public Double interest(Double amount, int months) {
        return amount * 0.1 * months;
    }
}
