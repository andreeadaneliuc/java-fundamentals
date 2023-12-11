package com.sda.oop;

public class Main {

    public static void main(String[] args) {
//        Dog dog = new Dog(); //constructor default
//
//        System.out.println(dog);

        //accesarea membrilor obiectului
//        dog.name = "Patrocle";
//        System.out.println(dog.name);
//        dog.bark();
//
//        Dog max = new Dog("Max");
//        System.out.println(max);
//        max.bread = "pikinez";
//        System.out.println(max.bread);

        //TEMA:
        // puneti o verificare in setter astfel incat size sa nu poata lua valori negative
        // la fel si la age

//        Dog max = new Dog("Max");
//        System.out.println(max);
//        max.setBread("Pechinez");
//        System.out.println(max.getBread());
//        max.setAge(4);
//        System.out.println("varsta este: " + max.getAge());

        //2 variabile care refera aceeasi zona de memorie
//        Dog charlie = max;
//        System.out.println(charlie);
//        charlie.setName("Charlie");
//        System.out.println("dupa modificare nume");
//        System.out.println(charlie);
//        System.out.println(max);
        //ambele variabile charlie si max refera acelasi obiect

        //copiem un ob folosinf constructor de copiere

//        Dog fluffy = new Dog(charlie);
//        fluffy.setName("Fluffy");
//        System.out.println(fluffy);
//        System.out.println(charlie);

        //VARIABILE CONSTANTE IN JAVA:
//        final double freezing_temperature = 0;
//        freezing_temperature = 1;
//        System.out.println(freezing_temperature);

        // VARIABILE STATICE:
        // dintr-un context static nu putem apela metode non statice
        //accesare membri statici se face prin numele clasei,
        //accesare membri nonstatici se face prin numele obiectului

        System.out.println(Dog.numberOfDogs);
        Dog.printNumebersOfDogs();

        //creati o metoda care sa calculeze media varstelor tuturor cateilor:
        //1. o metoda statica care sa ne intoarca rezultatul
        //media = suma varstelor / nr de obiecte (Dog.numberOfDogs)
        //sa calculam suma tuturor cateilor (variabila statica in clasa)

        Dog sky = new Dog("sky", "husky", "white", 6, 32.5, true);
        Dog thor = new Dog("thor", "rott", "black", 4, 40.0, true);

        System.out.println(Dog.getSumAgeOfDogs());
        System.out.println(Dog.averageAge());

        System.out.println(Dog.printMediaCateilor());
        Dog.printMediaCateilor();

        //creati o metoda care sa compare media varstelor cu speranta de viata a cateilor
        System.out.println(Dog.avgVsLifeExpectancy());

        Exemplu obj1 = new Exemplu();
        Exemplu obj2 = new Exemplu();

        System.out.println(Exemplu.getX());
    }
}

class Exemplu {
    private static int x = 0;

    public Exemplu() {
        x++;
    }

    public static int getX() {
        return x;
    }
}


