package com.sda.temaJF;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //creaza studenti:
        Student student1 = new Student(
                "Daneliuc Andreea",
                LocalDate.of(1997, 8, 5),
                1,
                new int[]{10, 10, 9, 8});

        Student student2 = new Student(
                "Daneliuc Andrei",
                LocalDate.of(1996, 12, 10),
                2,
                new int[]{9,9,8,7});

        //metoda1:
        int rezultatMetoda1 = Student.getNumarStudenti();
        System.out.println("Numarul de studenti este: " + rezultatMetoda1);

        //metoda2:

        double mediaNotelorStudent1 = student1.getMediaNotelor();
        System.out.println("Media notelor studentului 1 este de: " + mediaNotelorStudent1);

        double mediaNotelorStudent2 = student2.getMediaNotelor();
        System.out.println("Media notelor studentului 2 este de: " + mediaNotelorStudent2);

        //metoda3:

        int varsta1 = student1.getVarsta();
        int varsta2 = student2.getVarsta();
        System.out.println("Varsta stundetului 1: " + varsta1 + " si a studentului 2: " + varsta2);
    }
}
