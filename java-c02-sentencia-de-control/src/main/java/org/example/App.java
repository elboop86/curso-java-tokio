package org.example;

public class App {
    public static void main(String[] args) {

        // if= si se cumple la opción imprime condicion cumplida
        // if anidado= cuando pongo otra variable dentro
        int x = 18;

        if (x > 10) {
            System.out.println("Condicion cumplida");
            int y = 9;
            if (y < x) ;
            System.out.println(y);

        }
        if (x < 10) {
            System.out.println("Entraria para todos lo valores inferiores a 10");
        } else {
            System.out.println("Entraria para todos lo valores igual o superior a 10");
        }


        // Tabla de acceso por edad

        int edad = 131;

        if(edad > 130) {
            System.out.println("Error de edad no valido");
        } else {
            if (edad<18) {
                System.out.println("Menor de edad");
            } else if (edad<30) {
                System.out.println("Joven");

            }else if (edad<65) {
                System.out.println("Adulto");
            } else {
                System.out.println("Anciano");
            }
        }
        // Caso switch: cuando propones casos a elegir con valor numérico

        x = 1;
        switch (x) {
            case 1 -> System.out.println("Caso1");
            case 2 -> System.out.println("Caso2");
            case 3 -> System.out.println("Caso3");
            default -> System.out.println("Ningun caso es correcto");
        }

        // Caso switch: cuando propones casos a elegir con valor de texto

       String y = "hola";
        switch (y) {
            case "uno" -> System.out.println("Caso1");
            case "adios" -> System.out.println("Caso2");
            case "hola" -> System.out.println("Caso3");
            default -> System.out.println("Ningun caso es correcto");
        }
    }

}