package org.example;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write: \nASIA, SOUTH_AMERICA, ASIA. EUROPE, ANTARCTICA, AUSTRALIA, NORTH_AMERICA");
        try {
            String str = scanner.nextLine().toUpperCase();
            Continent continent = Continent.valueOf(str);
            System.out.println(continent.getPopulationDensity());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid continent name. Please enter a valid continent.");
        } finally {
            scanner.close();
        }
    }
}