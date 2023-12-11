package com.sda.statics;

import com.sda.oop.Dog;

import static com.sda.oop.Dog.LIFE_EXPECTANCY;
import static com.sda.oop.Dog.printNumebersOfDogs;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        System.out.println(LIFE_EXPECTANCY);
        printNumebersOfDogs();

        //creati o metoda care sa calculeze aria unui cerc PI * R^2
        double raza = 6d;
        System.out.println("Aria cercului este: " + ariaCercului(raza));

        //metoda pt generare nr aleatoriu
        System.out.println("Numar aleatoriu: " + Math.random());
        System.out.println("Numar aleatoriu: " + Math.random() * 100);

        //interval formula nr* (max-min)+min
        int min = 5;
        int max = 67;
        double rezultat = Math.random() * (max - min) + min;
        System.out.println("Numar aleatoriu dintr-un interval: " + rezultat);
    }

    public static double ariaCercului(double r) {
        return PI * pow(r, 2);
    }
}

