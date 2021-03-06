package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class ConverterCelsiusToFahrenheit {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Celsius degree:");
        double celsius = scanner.nextDouble();
        System.out.printf("%.2f Celsius is %.2f Fahrenheit", celsius, ((9.0 / 5) * celsius + 32));
    }
}
