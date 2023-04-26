package org.example.udemy.polimorfismo.paypal.services;

import org.example.udemy.polimorfismo.paypal.entities.Contract;
import org.example.udemy.polimorfismo.paypal.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {
        double baseQuota = contract.getTotalValue() / months;
        for (int x = 0; x < months; x++) {
            LocalDate dateNow = contract.getDate().plusMonths(x);
            double interest = onlinePaymentService.interest(baseQuota, x);
            double fee = onlinePaymentService.payment(baseQuota + interest);
            double quota = baseQuota + interest + fee;

            contract.getInstallment().add(new Installment(dateNow, quota));


        }
    }
}
