package com.sda.conditionals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("IF");

        double temperature = 6;
        if (temperature <= 0)
            //putem elimina acoladele, dar ATENTIE se va executa doar prima instructiune
            //de regula, chiar daca avem o sg instructiune in if PUNEM ACOLADE
            System.out.println("Afara este frig");
        System.out.println(temperature);

        if (temperature <= 6) {
            System.out.println("Afara e cald");
        } else {
            System.out.println("Afara este decent");
        }

        // verificati daca un nr este par sau impar, nr citit de la tastatura

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar : ");
        int numar = scanner.nextInt();
        System.out.println("Numarul citit este: " + numar);

        if (numar %2 ==0) {
            System.out.println("Numarul este par: " + numar);
        } else {
            System.out.println("Numarul este impar: " + numar);
        }
        */

        temperature = 20;
        if (temperature <= 0) {
            System.out.println("Afara e cald");
        } else if ( temperature <= 20) {
            System.out.println("Afara este decent");
        } else if (temperature > 20) {
            System.out.println("Afara este cald");
        }

        System.out.println("SWITCH");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introdu o zi: ");
        String zi = scanner1.next();

        System.out.println("Ziua saptamanii este: " + zi);

        switch (zi) {
            case "L":
                System.out.println("Luni");
                break;
            case "M":
                System.out.println("Marti");
                break;
            case "Mi":
                System.out.println("Miercuri");
                break;
            case "J":
                System.out.println("Joi");
                break;
            case "V":
                System.out.println("Vineri");
                break;
            case "S":
                System.out.println("Sambata");
                break;
            case "D":
                System.out.println("Duminica");
                break;
            default:
                System.out.println("Valoarea introdusa nu corespunde unei zile a saptamanii");
        }
    }
}
