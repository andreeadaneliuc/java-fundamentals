package com.sda.exercitii;

import java.util.Scanner;

public class MainExercitii {
    public static void main(String[] args) {

        //ex5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti temperatura in grade Celsius: ");
        int tempCels = scanner.nextInt();

        System.out.println("Temperatura in grade Fahrenheit este de: " + Temp.convertTempCelsFahr(tempCels));

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceti temperatura in grade Fahrenheit: ");
        int tempFahr = scanner1.nextInt();

        System.out.println("Temperatura in grade Celsius este de: " + Temp.convertTempCelsFahr(tempFahr));

        //ex6
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int numar1 = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Introduceti al doilea numar: ");
        int numar2 = scanner3.nextInt();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Introduceti semnul de operatie: ");
        String operatie = scanner4.nextLine();

        double rezultat = Operatii.operatii(numar1, numar2, operatie);
        System.out.println(rezultat);
    }
}
