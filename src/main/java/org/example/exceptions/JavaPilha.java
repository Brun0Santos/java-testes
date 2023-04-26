package org.example.exceptions;

public class JavaPilha {
    public static void main(String[] args) {

        System.out.println("Ini do main");
        try {

            metodo1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Passando pela exception");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {

            metodo2();
        } catch (OtherException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");

        throw new OtherException("Deu erro ne vida");

        //System.out.println("Fim do metodo2");
    }
}

