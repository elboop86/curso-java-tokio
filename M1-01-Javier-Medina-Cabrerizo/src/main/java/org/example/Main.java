package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre su peso:");
        int peso = entrada.nextInt();
        entrada.nextLine();
        int total= peso*17/100;
        System.out.println("Su peso en la Tierra es: "+ peso+ " y en la Luna " + total+ " kilos");

    }
}