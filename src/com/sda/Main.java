package com.sda;

import com.sda.oop.Dog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Andreea"); //afisam textul Hello Andreea!
        // comentariu pe o singura linie = este ignorat de compilator
        /*
        comentariu
        pe mai
        multe linii
         */

        // declarare variabila: tip de data + nume variabila
        // String reprezinta un sir de caractere
        String firstName;

        //initializare variabila
        firstName = "Andreea";

        //atribuire valoare variabila
        firstName = "Elena";

        // declarare si initializare
        String message = "Java is cool.";

        //concatenare intre doua siruri de caractere cu operatorul +
        System.out.println("Hello " + firstName + " - " + message);

        // println afiseaza sirul de caractere si la final adauga un caracter new line - \n
        // print afiseaza sirul de caractere dar nu adauga o linie noua la final
        System.out.print("Print \n");

        //pentru a afisa caractere speciale punem \
        System.out.print("\"Print 2\"");
        System.out.println();
        System.out.println();

        //citirea de la tastatura 20.11.2023
        Scanner scanner = new Scanner(System.in); //am creat un ob scaner care ne citeste din consola

        System.out.println("Introduceti un numar intreg: ");
        int numarCitit = scanner.nextInt();
        System.out.println("Numarul citit este: " + numarCitit);

        System.out.println("Introduceti un numar real: ");
        double numarCitit2 = scanner.nextDouble();
        System.out.println("Numarul citit este: " + numarCitit2);

        System.out.println("Introduceti un text: ");
        String text = scanner.next();
        System.out.println(text);






    }
}