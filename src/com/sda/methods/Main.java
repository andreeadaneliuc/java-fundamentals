package com.sda.methods;

public class Main {
    public static void main(String[] args) {

        String name = "Andreea";
        System.out.println("Hello, " + name);
        System.out.println("Hello, Alexandra");
        System.out.println("Hello, Andrei");
        System.out.println("Hello, Sky");

        //apel metoda:
        afisareMesaj(name);

        int a = 10;
        double b = 5.5;
        double sum = a + b;

        System.out.println(sumaNumerelor(a, b));

        int c = 3;
        System.out.println(sumaNumerelor(c, sumaNumerelor(a,b))); //apelam o metoda (a+b) in alta metoda

        sum = sumaNumerelor(a,c);
        System.out.println(sum);
        System.out.println(sumaNumerelor(a,c));
        System.out.println(sumaNumerelor(b,a,c));

        //tema
        int[] listaTest = {1, 2, 3};
        System.out.println("Suma nr din lista este: " + sumaNumerelor(listaTest));

        System.out.println(sumaNumerelor("suma numerelor este: ", 2, 3, 4, 5));
        System.out.println(sumaNumerelor("Suma este:", 55, 78));
    }


        //modificator de acces:
        // 1. public = o putem accesa de oriunde
        // 2. private = doar in cadrul clasei unde este
        // 3. protected = accesata in acelasi/alte pachete, dar dintr-o clasa copil
        // 4. defauld (nu scriem nimic) =in pachet

        // tip returnare:
        // 1. void = NU returnam o valoare,
        // 2. returnam: toate tipurile (int, long, boolean, etc), string, array, pe care le poate lua o variabila

        //apel metoda: nume metoda


        // METODA:
        // modificator de acces + static + tip returnare + denumire (lista parametrii)


    static void afisareMesaj (String name) {
        System.out.println("Hello from method, " + name);
    }

    static double sumaNumerelor(int x, double y) {
        // double s = x +y; //alta varianta
        return x + y; // return s
    }

    //supraincarcarea metodei sumaNumerelor = acelasi nume, dar lista de parametrii diferita
    static int sumaNumerelor (int x, int y) {
        return x +y;
    }

    static double sumaNumerelor (double x, int y, int z) {
        return x + y +z;
    }

        // supraincarcare metodei sumaNumerelor astfel incat sa primeasca ca parametru un Array
        //si in cadrul metodei sa se parcurga arrayul si sa se intoarca suma elementelor sale

    static int sumaNumerelor (int[] array) {
        int sumaArray = 0;
        for (int i = 0; i < array.length; i++){
            sumaArray = sumaArray + array[i];
        }
        return sumaArray;

    }

        //varargs
    static String sumaNumerelor (String mesaj, int... args) { //se comporta ca un array dar nu stie cate elemente are
        int sumaArray = 0;
        for (int i = 0; i < args.length; i++){
            sumaArray = sumaArray + args[i];
        }
        return mesaj + " " + sumaArray;
    }

    //creati o metoda care sa realizeze media numerelor primite ca parametrii
    //sa folosim apelul metodei sumaNumerelor

    static int mediaNumerelor(int[] numbers) {
        return sumaNumerelor(numbers)/ numbers.length;
    }
    static double mediaNumerelor2(int...args) {
        return sumaNumerelor(args)/args.length;
    }

}




