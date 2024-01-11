package com.sda.exercitii;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*

        //ex1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar real: ");

        int numar = scanner.nextInt();

        pozNeg(numar);

        //ex2
        parImp(numar);

        //ex3

        System.out.println(sumaNr(numar));

         */

        //ex4

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceti ora: ");
        int ora = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduceti minutul: ");
        int minut = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Introduceti secundele: ");
        int secunde = scanner3.nextInt();

        LocalTime oraModificata = LocalTime.of(ora, minut, secunde);
        System.out.println("Ora introdusa este: " + oraModificata);

        //ex4.2

        timeOfDay(oraModificata);

        //ex7

        System.out.println("Factorialul numarului introdus este: " + factor(12));

        //ex8 + ex9

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Introduceti cate elemente are lista1: ");
        int n = scanner4.nextInt();
        int lista1[] = new int[n];

        for (int i = 0; i < lista1.length; i++) {
            System.out.println("Introduceti elementul: ");
            lista1[i] = scanner4.nextInt();
        }

        System.out.println("Introduceti cate elemente are lista2: ");
        int m = scanner4.nextInt();
        int lista2[] = new int[m];

        for (int i = 0; i < lista2.length; i++) {
            System.out.println("Introduceti elementul: ");
            lista2[i] = scanner4.nextInt();
        }

        System.out.println("Numarul minim din lista este: " + minimLista(lista1));
        System.out.println("Numarul maxim din lista este: " + maximLista(lista1));
        System.out.println("Sirul cu lungimea cea mai mare este: " + Arrays.toString(sirMaxim(lista1, lista2)));


        //ex10

        CercEx10 cerc = new CercEx10("cercul1", 10);

        System.out.println("Raza cerc: " + CercEx10.razaCerc(10));
        System.out.println("Perimentru cerc: " + CercEx10.perimetruCerc(10));

        //ex11

        Masina masina1 = new Masina("bmw", "seria 5", 2019, 150);
    }

    //M1
    static void pozNeg(int numar) {
        if (numar > 0) {
            System.out.println("Numarul introdus este pozitiv.");
        } else if (numar < 0) {
            System.out.println("Numarul introdus este negativ");
        } else {
            System.out.println("Numarul introdus este egal cu 0");
        }
    }

    //M2
    static void parImp(int numar) {
        if (numar % 2 == 0) {
            System.out.println("Numarul introdus este par");
        } else {
            System.out.println("Numarul introdus este impar");
        }
    }

    //M3
    static int sumaNr(int numar) {
        int sum = 0;
        for (int i = 1; i <= numar; i++) {
            sum += i;
        }
        return sum;
    }

    //M4:
    static void timeOfDay(LocalTime time) {
        if (time.isAfter(LocalTime.of(4, 59)) &&
                time.isBefore(LocalTime.of(12, 0))) {
            System.out.println("dimineata");
        } else if (time.isAfter(LocalTime.of(11, 59)) &&
                time.isBefore(LocalTime.of(12, 20))) {
            System.out.println("zi");
        } else {
            System.out.println("noapte");
        }
    }



    //M7:
    static int factor(int numar) {
        int factorial = 1;
        if (numar >= 0 && numar % 2 == 0) {
            for(int i = 1; i <= numar; i++) {
                factorial *= i;
            }
            return factorial;
        } else {
            throw new RuntimeException("Nu ai introdus un numar intreg.");
        }
    }

    //M8:
    static int minimLista (int[] lista) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < lista.length; i++){
            if(min > lista[i]) {
                min = lista[i];
            }
        }
        return min;
    }
    static int maximLista (int[] lista) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < lista.length; i++) {
            if(max < lista[i]) {
                max = lista[i];
            }
        }
        return max;
    }

    //M9:
    static int[] sirMaxim (int[] lista, int[] lista1) {
        if( lista.length > lista1.length) {
            return lista;
        } else {
            return lista1;
        }
    }
}
