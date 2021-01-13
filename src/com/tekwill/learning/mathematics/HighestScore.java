package com.tekwill.learning.mathematics;

import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student's number, and then the score and name for each of them:");
        int numberOfStudents = scanner.nextInt();
        String currentStudentName = scanner.next();
        int highestScore = scanner.nextInt();
        for (int i = 1; i < numberOfStudents; i++) {
            String studentName = scanner.next();
            int studentScore = scanner.nextInt();
            if (highestScore < studentScore) {
                highestScore = studentScore;
                currentStudentName = studentName;
            }
        }
        System.out.println("Highest score: " + currentStudentName + " " + highestScore);
    }
}
