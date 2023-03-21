package org.example;

import java.util.Scanner;

// Indica tu peso altura y con condicionales if else te dirán el grado de obesidad

public class ejercicioIndiceMasaCorporal {
    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);

        int peso;
        double altura;
        double imc;

        System.out.println("Dime tu peso ");
        peso = Integer.parseInt(entrada.nextLine());
        System.out.println("Dime tu altura");
        altura =Double.parseDouble(entrada.nextLine());

        imc = peso / (altura* altura);

        System.out.println("Indice de masa corporal: " + imc);
        
        if (imc < 18.5) {
            System.out.println("poco peso");
        } else if (imc<24.9) {
            System.out.println("Saludable");
        } else if (imc<29.9) {
           System.out.println("SobrePeso"); 
        } else  {
           System.out.println("obesidad");
        }


    }
}
