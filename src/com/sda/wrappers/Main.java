package com.sda.wrappers;

public class Main {
    public static void main(String[] args) {
       int maxInt = Integer.MAX_VALUE;
       int minInt = Integer.MIN_VALUE;
        System.out.println(minInt + " <->" + maxInt);

        float numarFloat1 = 9.14F; //primitiva
        Float numarFloat2 = 6.14F; //obiect

        System.out.println(numarFloat2);

       int comparare = numarFloat2.compareTo(numarFloat1); //face autoboxing
        System.out.println(comparare);
        //0 inseamna ca e ==
        //1 inseamna ca primul nr e mai mare
        //-1 inseamna ca primul nr e mai mic

        int numarInt = 97;
        long numarLong = (long) numarInt;
        Long objLong = (long) numarInt;

        Double numarDouble = 89.78d;
        //unboxing
        double numarDouble2 = numarDouble;
        int numarInt2 = numarDouble.intValue();
        System.out.println(numarDouble2 + " " + numarInt2);

        //wrapper -> sir de caractere

       // String numarLongSir = numarLong.toString();
        String numarDoubleSir = numarDouble.toString();
       // System.out.println(numarLongSir + " " + numarDoubleSir);

        //sir de caractere -> wrapper
        String numarString = "12345.67";
        Double numarDoubleFromSir = Double.valueOf(numarString);
       // Integer numarDoubleFromSir = Integer.valueOf(numarString); //NumberFormatException
        System.out.println(numarDoubleFromSir);

        //valueOf() = returneaza double(ob) vs parseDouble() = returneaza double (primitiva)

        Double numarDoubleFromSir2 = Double.parseDouble(numarString);
        System.out.println(numarDoubleFromSir2);


    }
}
