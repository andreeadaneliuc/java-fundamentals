package com.sda.exercitii;

public class Masina {

    String marca;
    String model;
    int anFabricatie;
    double vitezaCurenta;
    int numarMasini;


    public void accelereaza() {
        System.out.println("Accelereaza");
        // Implementare
    }

    public double decelereaza() {
        System.out.println("Franeaza");
        // Implementare
        return 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public double getVitezaCurenta() {
        return vitezaCurenta;
    }

    public void setVitezaCurenta(double vitezaCurenta) {
        this.vitezaCurenta = vitezaCurenta;
    }

    public Masina(String marca, String model, int anFabricatie, double vitezaCurenta) {
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.vitezaCurenta = vitezaCurenta;
        numarMasini++;



    }
}
