package com.sda.operators;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // a + b => a,b sunt operanzi, + este operator, a+b este expresie

        //operatori unari = au un singur operand
        //exemplu:
        // a++, ++a, a--, --a
        // +a, -a, +7, -7
        // !a
        // a<b || b<c

        System.out.println(+7); //aratam ca e pozitiv nr
        System.out.println(-7); //aratam ca e negativ nr
        System.out.println(-(-3));
        System.out.println();

        boolean isTrue = true;
        System.out.println(!isTrue);
        System.out.println();

        // post-incrementare si post-decrementare
        int numar = 7;
        System.out.println("Post-incrementare: " + numar++); //7
        System.out.println("Dupa post-incrementare: " + numar); //8
        System.out.println();

        System.out.println("Post-decrementare: " + numar--); //8
        System.out.println("Dupa post-decrementare: " + numar); //7
        System.out.println();

        // pre-incrementare si pre-decrementare
        System.out.println("Pre-incrementare: " + ++numar); //8
        System.out.println("Dupa pre-incrementare: " + numar++); //8
        System.out.println();

        System.out.println("Pre-decrementare: " + --numar); //7
        System.out.println("Dupa pre-decrementare: " + --numar); //7
        System.out.println();

        // operatori binari (au doi operanzi)
        // aritmetici: +, - , /, *, % (modulo = restul impartirii)
        // comparatie: >, <, >=, <=, ==, !=
        // atirbuire: =, +=, -=, *=, /=, %=
        // logici: &&, ||, !,
        // pe biti: &, |, ^ (xor), >>, >>>, <<, <<<

        System.out.println((7+5 * 2) % 2);
        int a = 5,b = 7;
        boolean isTrue2 = a < b;
        System.out.println(isTrue2);

        b *=2; // b= b*2
        System.out.println(b);

        boolean isTrue3 = isTrue2 && (3 != 10); // true && true
        // && - daca expresia din stranga este adevarata se evalueaza si urm expresie
        // - daca expresia din stanga este falsa NU se mai evalueaza si cea din dreapta

        // || - daca expresia din stanga este adevarata NU se mai evalueaza si urm
        // - daca expresia din stanga este falsa se evalueaza si urm

        System.out.println(isTrue3);

        //ordinea operatorilor:
        a=6;
        System.out.println(2 * (a++) + (a--) + 1);
        System.out.println("a= " + a);
        // 2 * 6+ (a--) * 1
        // a devine 7
        // 2 * 6 + 7 + 1 = 20
        // a devine 6

        boolean isValid = (5 +3) *2 > 10 && 7 != 3;

        // operatorul ternar (are 3 operanzi)

        double number = 50;
        boolean isHigherThan30 = (number > 30) ? true : false; // daca atunci altfel

        String isHeigherThan30String = (number > 30) ? "conditia este adrevarata" : "conditia este falsa";
        System.out.println(isHeigherThan30String);



    }
}
