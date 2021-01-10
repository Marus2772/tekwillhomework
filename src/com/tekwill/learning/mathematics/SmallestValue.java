package com.tekwill.learning.mathematics;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        System.out.println("Enter a list of integers, first enter how many integers will be in the list and then the integers delimitated by space:");
        Scanner scanner = new Scanner(System.in);
        int numberOfIntegers = scanner.nextInt();
        int smallestInteger = scanner.nextInt();


        for (int i = 1; i < numberOfIntegers; i++) {
            int number = scanner.nextInt();
            if (smallestInteger > number) {
                smallestInteger = number;
            }

        }
        System.out.println("Smallest integer is: " + smallestInteger);
    }
}
