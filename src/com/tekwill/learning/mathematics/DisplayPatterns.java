package com.tekwill.learning.mathematics;

import java.util.Scanner;

public class DisplayPatterns {
    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = n + 1 - i; k > 1; k--) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int numbers = 3;
        while (numbers > 0) {
            displayPattern(scanner.nextInt());
            numbers--;
        }

    }
}
