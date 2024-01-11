package com.sda.exercitii;

public class Operatii {
    //ex6
    static double operatii(int numar1, int numar2, String operant) {
        switch (operant) {
            case "+":
                return numar1 + numar2;
            case "-":
                return numar1 - numar2;
            case "*":
                return numar1 * numar2;
            case "/":
                return numar1 / numar2;
            case "%":
                return numar1 % numar2;
            default:
                throw new RuntimeException("Nu ai introdus o operatie corecta.");
        }
    }
}
