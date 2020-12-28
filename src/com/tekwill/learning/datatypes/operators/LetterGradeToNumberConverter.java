package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class LetterGradeToNumberConverter {
    public static int number;


    public static void convertToNumber(char letter) {
        if (letter == 'A') {
            System.out.println("The numeric value for grade A is 4");
        } else if (letter == 'B') {
            System.out.println("The numeric value for grade B is 3");
        } else if (letter == 'C') {
            System.out.println("The numeric value for grade C is 2");
        } else if (letter == 'D') {
            System.out.println("The numeric value for grade D is 1");
        } else if (letter == 'F') {
            System.out.println("The numeric value for grade F is 0");
        } else {
            System.out.println(letter + " is an invalid grade");
        }

    }

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an uppercase letter from A to F:");
        char letter = scanner.next().charAt(0);

    }
}