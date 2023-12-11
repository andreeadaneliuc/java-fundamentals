package com.sda.strings;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = new String("Hello, World!"); //nu e in javapool
        String str3 = "Hello, World!";
        String str4 = str1;

        str1 = str1 + "-";

        //verificarea egalitatii referintelor
        if(str1 == str4) {
            System.out.println("Referinte egale");
        } else {
            System.out.println("Referinte diferite");
        }

        //verificare egalitatii obiectelor
        if(str1.equals(str4)) {
            System.out.println("Obiecte egale");
        } else {
            System.out.println("Obiecte diferite");
        }

        char[] chars = {'S', 'a', 'l', 'u', 't', '!'};
        String str5 = new String(chars);
        System.out.println(str5);

        String str6 = new String(chars,0,5); // sau chars.length -1
        System.out.println(str6);

        //comparare siruri de caractere
        String nume1 = "Andreea";
        String nume2 = "Gigel";
        System.out.println(nume1.compareTo(nume2));
        //valori - rezulta ordine alfabetica
        //valori + rezulta ordine invers alfabetica

        char a = 'A', g = 'G';
        System.out.println((byte)a + " " + (byte)g);
        System.out.println(a - g);

        String exemplu = "Exemplu";

        int lungime = exemplu.length();
        System.out.println("Lungime" + exemplu);

        int index = exemplu.indexOf("em");
        System.out.println("Index \"em\": " + index);

        char caracter = exemplu.charAt(index);
        System.out.println("Caracterul de pe pozitia index: " + caracter);

        String subsir1 = exemplu.substring(index);
        System.out.println("Subsir 1: " + subsir1);

        String subsir2 = exemplu.substring(index, exemplu.length()-1);
        System.out.println("Subsir 2: " + subsir2);

        String mare = exemplu.toUpperCase();
        System.out.println("Litere mari: " + mare);

        String mic = exemplu.toLowerCase();
        System.out.println("Litere mici: " + mic);

        String concatenat = exemplu.concat(" siruri de caractere");
        System.out.println(concatenat);
        System.out.println(exemplu + " siruri de caractere");

        String replaced = exemplu.replace('e', 'a');
        System.out.println("Replaced: " + replaced);

        boolean incepeCuEx = exemplu.startsWith("ex");
        System.out.println(incepeCuEx ? "Incepe cu Ex" : "Nu incepe cu Ex");

        //exercitiu:
        //cum modificati exemplul de mai sus, astfel incat sa nu tina cont de litere mici/mari

        boolean incepeCuEx2 = exemplu.toLowerCase().startsWith("ex".toLowerCase());
        System.out.println(incepeCuEx2 ? "incepe cu ex" : "nu incepe cu ex");

        boolean seTerinaCuLu = exemplu.toUpperCase().endsWith("lu".toUpperCase());
        System.out.println(seTerinaCuLu ? "Se termina cu lu" : "Nu se termina cu lu");

        String[] cuvinte = concatenat.split(" ");
        for (String cuvant:
             cuvinte) {
            System.out.println(cuvant);
        }

        //instanceof

        Object obj2 = 6; //object e clasa parinte, din ea face parte string, etc etc
        if(obj2 instanceof String) {
            System.out.println("Obiectul este o instanta a clasei String");
        } else {
            System.out.println("Obiectul NU este o instanta a clasei String");
        }

        Object obj = 6; //object e clasa parinte, din ea face parte string, etc etc
        if(obj instanceof Integer) {
            System.out.println("Obiectul este o instanta a clasei Integer");
        } else {
            System.out.println("Obiectul NU este o instanta a clasei Integer");
        }

        int val = 6; // este o primitiva


    }
}
