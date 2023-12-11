package com.sda.dateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        // LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        int ora = localTime.getHour();
        int minute = localTime.getMinute();
        int secunde = localTime.getSecond();
        int nanosecunde = localTime.getNano();
        System.out.println(ora + "-" + minute + "-" + secunde + "-" + nanosecunde);

       LocalTime localTime1 = LocalTime.of(18, 50, 12);
       System.out.println(localTime1);

       LocalTime localTime2 = localTime1.plusHours(1);
        System.out.println(localTime2);

        String timeformat = localTime1.format(DateTimeFormatter.ofPattern("hh-m-s a"));
        //H (0-23) , h (1-12), m, s, a(AM/PM) - pentru formatul h
        System.out.println("LocalTime format " + timeformat);

        //LocalDate

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        int an = localDate.getYear();
        int luna = localDate.getMonthValue();
        int zi = localDate.getDayOfMonth();
        int ziDinAn = localDate.getDayOfYear();
        System.out.println(zi + "/" + luna + "/" + an + "-> ziua din an: " + ziDinAn);

        LocalDate revelion2024 = LocalDate.parse("2024-01-01");
        System.out.println(revelion2024);

        String dateformat = localDate.format(DateTimeFormatter.ofPattern("DD dd:MM:yy"));
        //yy, yyyy, MM, dd, DD (ziua din an), w (nr sapt din an),
        System.out.println("LocalDate format " + dateformat);

        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        String result = localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println(result);

        //Instant
        Instant instant = Instant.now();
        System.out.println(instant);

        long sec = instant.getEpochSecond();
        int nanoSec = instant.getNano();
        System.out.println("sec: " + sec + "; nanosecunde: " + nanoSec);

        //Duration = intre 2 momente de TIMP
        LocalTime start = LocalTime.of(18, 05, 30);
        LocalTime end = LocalTime.of(20, 50, 55);

        Duration duration = Duration.between(start, end);
        System.out.println("Durata dintre " + start + " si " + end + " este " + duration);


        //Period = intre DATE

        LocalDate startDate = LocalDate.of(2023, 11, 7);
        LocalDate endDate = LocalDate.of(2024, 7, 11);
        Period perioada = Period.between(startDate, endDate);
        System.out.println("Perioada dintre " + startDate + " si " + endDate + " este: " + perioada);



    }
}
