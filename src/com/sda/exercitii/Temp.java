package com.sda.exercitii;

import java.util.Scanner;

public class Temp {
    //ex5
    static int convertTempCelsFahr (int temperaturaCelsius) {
        return ((temperaturaCelsius * 9/5) + 32);
    }

    static int convertTempFahrCels (int temperaturaFahr) {
        return (((temperaturaFahr - 32) * 5) / 9);
    }
}
