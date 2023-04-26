package org.example.udemy.polimorfismo.carros.app;

import org.example.udemy.polimorfismo.carros.model.CarRental;
import org.example.udemy.polimorfismo.carros.model.Invoice;
import org.example.udemy.polimorfismo.carros.model.RentalService;
import org.example.udemy.polimorfismo.carros.model.Vehicle;
import org.example.udemy.polimorfismo.carros.services.BrazilTaxService;
import org.example.udemy.polimorfismo.carros.services.URSSTaxService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppCar {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDateTime start = LocalDateTime.parse("24/04/2022 10:30", formatter);
        LocalDateTime finish = LocalDateTime.parse("26/04/2022 14:40", formatter);


        Vehicle vehicle = new Vehicle("Civic");

        CarRental carRental = new CarRental(start, finish, vehicle);
        BrazilTaxService brazilTaxService = new BrazilTaxService();
        URSSTaxService urssTaxService = new URSSTaxService();

        RentalService service = new RentalService(10.00, 130.00, urssTaxService);
        service.processInvoice(carRental);

        System.out.println("Pagamento basico " + carRental.getInvoice().getBasicPayment());
        System.out.println("Imposto " + carRental.getInvoice().getTax());
        System.out.println("Imposto " + carRental.getInvoice().getTotalPayment());

    }
}
