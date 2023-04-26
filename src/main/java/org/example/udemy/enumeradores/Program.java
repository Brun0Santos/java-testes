package org.example.udemy.enumeradores;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Order order = new Order(1, new Date(), OrderStatus.DELIVERED);

        System.out.println(order);
    }



}
