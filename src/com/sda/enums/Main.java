package com.sda.enums;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        //ne luam o variabila de tip ZiSaptamana pe care sa o verificam in cadrul unei structuri
        //switch si in functie de caz sa afisam un mesaj.
        //ex: astazi este joi

        ZiSaptamana zi = ZiSaptamana.JOI;
        System.out.println(zi);

        switch (zi) {
            case LUNI -> System.out.println("Astazi este luni.");
            case MARTI -> System.out.println("Astazi este marti.");
            case MIERCURI -> System.out.println("Astazi este miercuri");
            case JOI -> System.out.println("Astazi este joi");
            case VINERI -> System.out.println("Astazi este vineri");
            case SAMBATA -> System.out.println("Astazi este sambata");
            case DUMINICA -> System.out.println("Astazi este duminica");
            default -> System.out.println("Valoare incorecta");
        }
    }
}
