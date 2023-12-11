package com.sda.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {
    public static void main(String[] args) {

        //1. sa extragem toate numerele din cadrul unui text

        String text1 = "Astazi este 7 decembrie (12), anul 2023, iar temperatura este de -1 grade celsius.";
        String regex1 = "[\\-]?\\d+"; // \d* [0123456789]+ [0-9]

        Pattern pattern1 = Pattern.compile(regex1); //transformam Stringul in care avem sablonul regex in obiect pattern
        Matcher matcher1 = pattern1.matcher(text1); //creeam ob matcher pe baza patternului si a textului verificat

        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }

        //2. verificam o adresa de email dupa un sablon
        String email = "exemplu@gmail.com";
        String emailRegex = "[\\w-\\.]+@([\\w]+){1}\\.[\\w]{2,4}";

        //varianta 1
        Pattern pattern2 = Pattern.compile(emailRegex);
        Matcher matcher2 = pattern2.matcher(email);

        if (matcher2.matches()) {
            System.out.println("email valid");
        } else {
            System.out.println("email invalid");
        }

        //varianta 2
        boolean isMatched;
        isMatched = Pattern.compile(emailRegex).matcher(email).matches(); //am luat primele 3 linii de la varianta1

        if (isMatched) {
            System.out.println("email valid");
        } else {
            System.out.println("email invalid");
        }

        //3. extragere nume si prenume (grupuri)
        String text3 = "Numele: Ionescu Prenume: Ion Gigel";
        String regex3 = "Numele: (\\w+) Prenume: ([\\w\\s]+)";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(text3);

        if (matcher3.find()) {
            String nume = matcher3.group(1); // Obțineți primul grup (nume)
            String prenume = matcher3.group(2); // Obțineți al doilea grup (prenume)
            System.out.println(nume);
            System.out.println(prenume);

            // index
            int startIndex1 = matcher3.start(1);
            int endIndex1 = matcher3.end(1);
            System.out.println(startIndex1 + " " + endIndex1);
        }

    }
}
