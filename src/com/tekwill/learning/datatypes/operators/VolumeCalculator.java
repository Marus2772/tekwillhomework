package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class VolumeCalculator {
    public static double cylinderArea(float radius, float height) {
        return (Math.PI * Math.pow(radius, 2) * 2) + (2 * Math.PI * radius * height);
    }

    public static double cylinderVolume(float radius, float height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius and height of a cylinder splitted by space");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        float radius = Float.parseFloat(numbers[0]);
        float height = Float.parseFloat(numbers[1]);

        System.out.printf("The cylinder area is: %.2f\n", cylinderArea(radius, height));
        System.out.printf("The cylinder volume is: %.2f", cylinderVolume(radius, height));
    }
}