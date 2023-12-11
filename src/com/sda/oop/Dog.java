package com.sda.oop;

import java.lang.invoke.StringConcatFactory;

public class Dog {
    //variabile de instanta =campurile clasei = starea
    private String name;
    private String bread;
    private String color;
    private int age;
    private double size;
    private boolean happy;
    public static int numberOfDogs = 0; //static = camp ce tine de clasa, nu de obiect
    public static int sumAgeOfDogs = 0;
    public static final int LIFE_EXPECTANCY = 17;

    //alt + insert = a sa generati constructorii, to string,
    //supraincarcare constructori

    public Dog() {
        //this.name = "No name";
        //this.bread = "Maidanez";
       // this.color = "N/A";
        //this.age = 0;
       // this.size = 0.0;
       // this.happy = true;
        numberOfDogs++;
        sumAgeOfDogs += age;
    }

    //constructor un singur parametru - name
    public Dog(String name) {
//        this.name = name; //instanta/ob curent
//        this.bread = "Maidanez";
//        this.color = "N/A";
//        this.age = 0;
//        this.size = 0.0;
//        this.happy = true;

        //apelul constructorului cu toti parametrii
        this(name, "maidanez", "N/A", 0, 0.0, true);
    }

    //constructorul cu toti parametrii
    public Dog(String name, String bread, String color, int age, double size, boolean happy) {
        this.name = name;
        this.bread = bread;
        this.color = color;
        this.age = age;
        this.size = size;
        this.happy = happy;
        numberOfDogs++;
        sumAgeOfDogs += age;
    }

    //constructor de copiere
    public Dog(Dog dog) {
        this.name = dog.name;
        this.bread = dog.bread;
        this.color = dog.color;
        this.age = dog.age;
        this.size = dog.size;
        this.happy = dog.happy;
        numberOfDogs++;
        sumAgeOfDogs += age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            System.out.println("age trebuie sa fie un numar pozitiv");
            return;
        }
        sumAgeOfDogs = sumAgeOfDogs - this.age +age;
        this.age = age;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if(size < 0) {
            System.out.println("size trebuie sa fie un numar pozitiv");
            return;
        }
        this.size = size;
    }

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    //metode = comportament
    public void bark() {
        System.out.println(name + " latra: ham! ham!");
    }

    public static void printNumebersOfDogs() {
        System.out.println("Numarul total de obiecte al clasei Dog: " + Dog.numberOfDogs);
    }

    public static double printMediaCateilor() {
       return (double) sumAgeOfDogs / numberOfDogs;
    }

    public static int getSumAgeOfDogs() {
        return sumAgeOfDogs;
    }

    public static double averageAge() {
        return (double)sumAgeOfDogs / numberOfDogs;
    }
    public static String avgVsLifeExpectancy() {
        if(averageAge() > LIFE_EXPECTANCY) {
            return "Media varstelor este mai mare decat speranta de viata";
        } else {
            return "Media varstelor este mai mica sau egala decat speranta de viata";
        }
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", size=" + size +
                ", happy=" + happy +
                '}';
    }
}
