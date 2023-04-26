package org.example.exceptions;

public class TestaContaComExcecao {
    public static void main(String[] args) {
        Conta c = new Conta();
        try {
            c.deposita();
        } catch (Exception e) {
            System.out.println("Deu erro");
            e.printStackTrace();
        }
    }
}
