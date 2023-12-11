package com.sda.loops;

public class Main {
    public static void main(String[] args) {
        System.out.println("FOR");

        //sa afisam toate nr de la 0 pana la un numar dat (number)
        int number = 10;
        for (int i = 0; i < number; i++ ) {
            System.out.println(i);
        }

        System.out.println("WHILE");
        int i = 0;
        while (i < number) {
            System.out.println(i);
            i++;
        }

        System.out.println("DO WHILE");
        //i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < number);

        //break

        System.out.println("BREAK");
        // vrem sa extragem primul numar divizibil cu 3 dintr-un interval

        int minNumber = 7, maxNumber =25;
        int numarExtras = 0;
        for (int j = minNumber; j <= maxNumber; j++) {
            if (j % 3 == 0) {
                numarExtras = j;
                break;
            }
            System.out.println(j);
        }
        System.out.println("numarul gasit este: " + numarExtras);


        //TEMA: cum s-ar scrie exercitiul de mai sus folosind while?

        numarExtras = 0;
        int j = minNumber;
        while (minNumber <= j && j <= maxNumber) {
            if (j % 3 == 0) {
                numarExtras = j;
                break;
            }
            System.out.println(j);
            j++;

        }
        System.out.println("numarul nou gasit este: " + numarExtras);

        System.out.println("CONTINUE");


        //sa extragem toate numere divizibile cu 5
        for (int k = minNumber; k <= maxNumber; k++) {
            if (k % 5 != 0) {
                continue;
            }
            System.out.println(k);
        }

        int minNum = 7;
        int maxNum =25;
        int k = minNum;
        while ( k <= maxNumber) {
            if (k % 5 != 0) {
                k++;
                continue;
            }
            k++;
            System.out.println(k-1);

        }

    }
}
