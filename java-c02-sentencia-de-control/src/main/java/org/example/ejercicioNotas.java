package org.example;

public class ejercicioNotas {
    public static void  main(String[] args) {
        int nota= 10;
        switch (nota) {
            case 0, 1, 2, 3, 4 -> System.out.println("Suspendido");
            case 5 -> System.out.println("Suficiente");
            case 6, 7 -> System.out.println("Bien");
            case 8, 9 -> System.out.println("Notable");
            case 10 -> System.out.println("Excelente");
        }
    }
}
//  Ejercicio de cualificación de notas