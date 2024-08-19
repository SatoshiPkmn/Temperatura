package org.example;

public class Main extends Convertir{

    public static void main(String[] args) {

        Convertir conv = new Convertir();

        int value;

        do {

        System.out.println("\n\nBIENVENIDO AL CONVERSOR DE TEMPERATURA\nSeleccione una opción \n1. Convertir Grados Celsius a Fahrenheit\n2. Convertir Grados Fahrenheit a Celsius\nCualquier otro número = Salir");

        value = conv.input.nextInt();

            if (value == 1) {

                conv.CelFah();

            } else if (value == 2) {

                conv.FahCel();

            }

        }
        while (value < 3);

            System.out.println("Finalizando ejecución");

    }

}