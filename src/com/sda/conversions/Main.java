package com.sda.conversions;

public class Main {
    public static void main(String[] args) {
        System.out.println("Conversii implicite");

        // 1.int - double
        int numarInt1 = 7;
        double numarDouble = numarInt1;
        System.out.println("Numarul int: " + numarInt1 + "; Numar double: " + numarDouble);
        System.out.println();

        // 2.int - float ( cu pierdere)
        int numarInt2 = 123456789;
        float numarFloat2 = numarInt2;
        System.out.println("Numarul int: " + numarInt2 + "; Numar float: " + numarFloat2);
        System.out.printf("Numarul int: %d; Numarul float: %.2f\n", numarInt2, numarFloat2);
        System.out.println();

        // 3. long - double (cu pierdere)
        long numarLong3 = 12435657676545656L;
        double numarDouble3 = numarLong3;
        System.out.println("Numarul long: " + numarLong3 + "; Numar double: " + numarDouble3);
        System.out.printf("Numarul long: %d; Numarul double: %.2f\n", numarLong3, numarDouble3);
        System.out.println(); //formatarea face rotunjire

        // 4. long - float (cu pierdere)

        // 5. char - int
        char character5 = 'D';
        int numarInt5 = character5;
        System.out.println("Caracterul: " + character5 + "; Numar int: " + numarInt5); //da numar ASCII
        System.out.println();

        System.out.println("Conversii explicite");

        // 6.long - int
        long numarLong = 1234567890123456789L;
        int numarInt = (int) numarLong;
        System.out.println("Numarul int: " + numarInt + "; Numar long: " + numarLong);
        System.out.println();

        // 7.int - byte 8biti(int < byte -128 -127)
        int numarInt7 = 200;
        byte numarByte7 = (byte) numarInt7;
        System.out.println("Numarul int: " + numarInt7 + "; Numar byte: " + numarByte7);
        System.out.println();

        // 200 - 128 = 72
        // 72 - 128 = =56

        // transformam numarul nostru din baza 10 in baza 2 (0 si 1)
        // cum s-ar scrie 200 ca suma de puteri a lui 2?
        // 200 = 128 + 64 + 8 (ce nr la pterea a 2a adunate fac nr nostru)
        // 2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0
        //  _   _   _   _   _   _   _   _
        //  1   1   0   0   1   0   0   0 ( 8 biti) = nr in baza 2

        //metoda 2: impartirea repetata la 2
        // 200/2 = 100 rest 0
        // 100/2 = 50 rest 0
        // 50/2 = 25 rest 0
        //25/2 = 12 rest 1
        //12/2 = 6 rest 0
        //6/2 = 3 rest 0
        //3/2 = 1 rest 1
        //1/2 = 0 rest 1
        //citim resturile de jos in sus: 1100 1000 (8biti)
        // 00000000000000000000000000000000 (32 biti pt int)

        //daca primul bit de la stanga este 1 inseamna ca nr este negativ
        //daca primul bit de la stanga este 0 nr este pozitiv

        //pentru a transforma 1100 1000 in baza 10:
        // complement 1: 0011 0111 (0 devine 1, 1 devine )
        // complement 2: 0011 0111 + 1 = 0011 1000 (1+1=0, )
        // 2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0
        //  _   _   _   _   _   _   _   _
        //  0   0   1   1   1   0   0   0 ==> 32 + 16 + 8 = 56
        //pentru ca bitul se semn a fost 1, stim ca numarul este negativ: -56
    }
}
