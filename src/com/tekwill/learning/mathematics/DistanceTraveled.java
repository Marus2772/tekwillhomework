package com.tekwill.learning.mathematics;

import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter speed (miles per hour) of vehicle and hours it has traveled:");
        int speed = scanner.nextInt();
        int hours = scanner.nextInt();
        System.out.println("Hours   Distance Traveled");

        for (int i = 1; i <= hours; i++) {
            System.out.println(i + "             " + speed * i);
        }

    }
}
