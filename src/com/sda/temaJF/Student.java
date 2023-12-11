package com.sda.temaJF;

import java.time.LocalDate;

public class Student {

    private String nume;
    private LocalDate dataNasterii;
    private final int cod;
    private int[] noteSemestru1;
    private static int numarStudenti;

    public Student(String nume, LocalDate dataNasterii, int cod, int[] noteSemestru1) {
        this.nume = nume;
        this.dataNasterii = dataNasterii;
        this.cod = cod;
        this.noteSemestru1 = noteSemestru1;
        numarStudenti++;
    }

    //metoda1:
    public static int getNumarStudenti() {
        return numarStudenti;
    }

    //metoda2:
    public double getMediaNotelor() {
        int suma = 0;
        for(int nota: noteSemestru1) {
            suma += nota;
        }
        return (double) suma / noteSemestru1.length;
    }

    //metoda3:
    public int getVarsta() {
        LocalDate ziActuala = LocalDate.now();
        int varsta = ziActuala.getYear() - dataNasterii.getYear();
        if(ziActuala.getMonthValue() < dataNasterii.getMonthValue()) {
            varsta--;
        }
        if(ziActuala.getMonthValue() == dataNasterii.getMonthValue() &&
                ziActuala.getDayOfMonth() < dataNasterii.getDayOfMonth()) {
            varsta--;
        }
        return varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public LocalDate getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(LocalDate dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public int getCod() {
        return cod;
    }

    public int[] getNoteSemestru1() {
        return noteSemestru1;
    }

    public void setNoteSemestru1(int[] noteSemestru1) {
        this.noteSemestru1 = noteSemestru1;
    }



}
