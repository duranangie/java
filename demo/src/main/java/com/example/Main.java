package com.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /* Java String */

        String[] arraysinicial = { "a", "b", "c" };

        String[] copiaarrays= new String[4];
        copiaarrays = Arrays.copyOfRange(arraysinicial, 0, 3);
        System.out.println(java.util.Arrays.toString(copiaarrays)); /*convierte la matriz en cadena */



    }
}