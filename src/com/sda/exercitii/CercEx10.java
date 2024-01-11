package com.sda.exercitii;

public class CercEx10 {
    String nume;
    double raza;

    public CercEx10(String nume, double raza) {
        this.nume = nume;
        this.raza = raza;
    }

    static double razaCerc(double raza) {
        return Math.PI * Math.pow(raza, 2);
    }

    static double perimetruCerc(double raza) {
        return 2 * Math.PI * raza;
    }
}
