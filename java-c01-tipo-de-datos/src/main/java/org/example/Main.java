package org.example;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        int numero = 14;
        long grande = 123L;
        double a = 12.56;
        float b = 23.45f;
        char letra = 'a';
        char salto = '\n';
        char letraM = 77;
        boolean x = true;
        boolean y;
        y = false;

        System.out.print(numero);
        System.out.print(salto);
        System.out.print(letra);
        System.out.print(salto);
        System.out.print(letraM);
        System.out.print(salto);
        System.out.print(grande);
        System.out.print(salto);

        long r1 = numero + grande;
        double r2 = numero * a;
        int r3 = 19 / 5;
        int r4 = 19 % 5;
        System.out.print(numero + grande);
        System.out.print(r1);
        System.out.print(r2);
        System.out.print(r3);
        System.out.print(r4);

        numero++;
        System.out.print(salto);
        System.out.print(numero);
        System.out.print(salto);

        int dato = 0;
        System.out.println(dato++);
        System.out.println(++dato);
        dato += 5 * 3;
        System.out.println(dato);

        boolean logico = (5 >= 4) || (4 <= 3);
        System.out.println(logico);

        System.out.println("Hola el numero es: " + dato + " otro numero" + numero);

        System.out.println("la suma de: " + dato + "+" + numero + "es: " + dato + numero);

        // Tipos de datos complejos

        String texto = "hola";
        Integer numInt = 10;
        Double numDouble = 10.4;
        Character letraChar = 'p';
        texto += "mundo";
        System.out.println(texto);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre un numero:");
        int num = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Entre u texto: ");
        String texto2 = entrada.nextLine();
        System.out.println("El numero es " + num + " el texto es " + texto2);


    }
}