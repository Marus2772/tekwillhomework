package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class WorldPopulation {
    public static long currentWorldPopulation = 7833500000L;

    public static float shareInWorldPopulationByCountry(long countryPopulation) {
        float Percentage = (float) countryPopulation / currentWorldPopulation * 100;
        return Percentage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The World Population is " + currentWorldPopulation + "\n Enter the Moldovian Population:");

        long Moldovian_population = scanner.nextLong();     //Moldovian populations is 3546000
        System.out.printf("The Population of the Moldova  is %.5f%%  of the World Population", shareInWorldPopulationByCountry(Moldovian_population));
    }
}
