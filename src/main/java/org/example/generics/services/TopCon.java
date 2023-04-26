package org.example.generics.services;

public class TopCon {

    public static void main(String[] args) {

        System.out.println(numDuplicates(321));

    }

    public static int numDuplicates(int number) {
        String binaryString = Integer.toBinaryString(number);
        System.out.println(binaryString);
        String bitBinario = String.valueOf(binaryString.charAt(3));
        return Integer.parseInt(bitBinario);
    }
}
