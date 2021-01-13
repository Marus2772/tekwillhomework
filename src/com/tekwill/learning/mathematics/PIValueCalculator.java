package com.tekwill.learning.mathematics;

public class PIValueCalculator {
    public static void main(String[] args) {
        double value = 4;
        double n = 3;

        for (int i = 0; i < 100000; i++) {
            value = value - 4.0 / n + 4.0 / (n + 2);
            n += 4;
        }
        System.out.printf("PI = %.20f", value);
    }
}
//we need to use about 13800 terms