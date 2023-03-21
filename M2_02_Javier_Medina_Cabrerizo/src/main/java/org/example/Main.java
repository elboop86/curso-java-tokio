package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre tres numeros enteros: ");
        int a = entrada.nextInt();
        entrada.nextLine();
        int b = entrada.nextInt();
        entrada.nextLine();
        int c = entrada.nextInt();
        entrada.nextLine();

        int op1 = a*b/c;
        System.out.println(op1);

        int op2 = (a*c)%b;
        System.out.println(op2);

        int op3 = 2*(a+c-b)/(b*c);
        System.out.println(op3);

        int op4 = ((a*c)+(b%a))/a-c;
        System.out.println(op4);

//_______________________________________En este con decimales no logro sacarlo
        System.out.println("Entre tres numeros con decimales: ");
        double aa = entrada.nextDouble();
        entrada.nextLine();
        double bb = entrada.nextDouble();
        entrada.nextLine();
        double cc = entrada.nextDouble();
        entrada.nextLine();

        double op11 = aa*bb/cc;
        System.out.println(op11);

        double op22 = (aa*cc)%bb;
        System.out.println(op22);

        double op33 = 2*(aa+cc-bb)/(bb*cc);
        System.out.println(op33);

        double op44 = ((aa*cc)+(bb%aa))/aa-cc;
        System.out.println(op44);

    }
}