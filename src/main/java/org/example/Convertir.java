package org.example;

import java.util.Scanner;

public class Convertir {

    Scanner input = new Scanner(System.in);

    double TempIni;
    double TempFin;

    public void CelFah() {

        System.out.println("Ingrese la temperatura Celsius");

        TempIni = input.nextInt();

        TempFin = ((TempIni * 1.8) + 32);

        System.out.printf(TempIni + "° Grados Celsius equivalen a " + TempFin + "° Fahrenheit");

    }

    public void FahCel() {

        System.out.println("Ingrese la temperatura Fahrenheit");

        TempIni = input.nextInt();

        TempFin = ((TempIni - 32) * 0.555);

        System.out.printf(TempIni + "° Grados Fahrenheit equivalen a " + TempFin + "° Celsius");

    }

}
