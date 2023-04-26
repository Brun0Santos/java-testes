package org.example.udemy.polimorfismo.app;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OtherTest {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        String dateNow = "12/11/2022 10:30";
        String otherDate = "12/11/2022 14:30";

        LocalDateTime dateNowFormatter = LocalDateTime.parse(dateNow, formatter);
        LocalDateTime otherDateFormatter = LocalDateTime.parse(otherDate, formatter);

        Duration duration = Duration.between(dateNowFormatter, otherDateFormatter);

        System.out.println(duration.toHours());

        System.out.println(dateNowFormatter);

    }
}
