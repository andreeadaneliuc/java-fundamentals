package com.sda.variables;

public class Main {
    public static final char symbol = '\n';
    public static void main(String[] args) {
        System.out.println(); //printeaza new line

        //String

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

        //primitive
        System.out.println();

        //byte
        byte numar = 10;
        System.out.println(numar);

        //short
        short numar2 = 100;
        System.out.println("Variabila short are valoarea: " + numar2);

        //int
        int height = 180;
        System.out.println("Inaltimea lui " + firstName + " este " + height + " cm");

        //float
        float temperature = 4.1F;
        System.out.println("Temperatura este de " + temperature + " grade Celsius");

        //double
        double temperature2 = 12.4;
        System.out.println("Temperatura ziua este de " + temperature2 + " grade Celsius");
        System.out.printf("Temperatura ziua este de %.2f grade Celsius, iar noaptea este de %.3f grade Celsius. \n", temperature2, temperature);

        //char
        char a ='a'; //caracterul
        char b = 98; //i-am dat ca valoare codul ascii corespunzator caracterului b
        System.out.println(b);
        System.out.println(a+b); //prioritate are adunarea si dupa concatenarea
        System.out.println(a + "" + b);

        // 2 variabile de tipuri diferite sau de acelasi tip nu pot avea acelasi nume
        char symbol = '\u00B0';
        System.out.println("Temperatura ziua este de " + temperature2 + symbol + "C, " +
                "iar noaptea este de " + temperature + symbol + "C");
        System.out.printf("Temperatura ziua este de %.2f %sC, iar noaptea este de %.3f %sC.\n", temperature2, symbol, temperature, symbol);

        //long
        long numarLong = 123456789; //conversie implicita de la int la long
        long numarLong2 = 12345678901234L; //da eroare daca nu specificam L deoarece il considera int pe care il converteste la long
        long numarLong3 = 12_345_678_901_234L;

        //boolean
        boolean isColdOutside = false;
        System.out.println(isColdOutside);
        System.out.println(isColdOutside ? "este frig" : "este cald afara");
        //de completat la operatori cum am afisa "este frig afara"



    }
}
