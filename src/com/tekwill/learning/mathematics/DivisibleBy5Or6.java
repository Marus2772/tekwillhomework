package com.tekwill.learning.mathematics;

public class DivisibleBy5Or6 {
    public static int n = 0;

    public static void main(String[] args) {
        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0 || i % 6 == 0) {
                if (!(i % 5 == 0 && i % 6 == 0)) {
                    System.out.print(i + " ");
                    n++;
                }
            }
            if (n == 10) {
                System.out.println();
                n = 0;
            }
        }
    }
}
