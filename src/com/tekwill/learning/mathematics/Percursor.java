package com.tekwill.learning.mathematics;

import java.util.Scanner;

public class Percursor {
    public static void main(String[] args) {
        boolean wrongAnswer = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select Your choice:\n" +
                "  a) America        b) Moldova\n" +
                "  c) Australia      d) Russia");
        char choice = scanner.next().charAt(0);

        while (choice != 'a' && choice != 'b' && choice != 'c' && choice != 'd') {
            System.out.println("Try to enter [a], [b], [c] or [d].");
            choice = scanner.next().charAt(0);
        }
        //wrongAnswer = false;
        switch (choice) {
            case 'a':
                System.out.println("Burger");
                break;
            case 'b':
                System.out.println("Wine");
                break;
            case 'c':
                System.out.println("Koala");
                break;
            case 'd':
                System.out.println("Vodka");

        }
    }
}
