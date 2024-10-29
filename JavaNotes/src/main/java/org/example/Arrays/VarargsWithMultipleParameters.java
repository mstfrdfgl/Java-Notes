package org.example.Arrays;

public class VarargsWithMultipleParameters {
    public static void printAverage(String name, int... scores) {
        if (scores.length == 0) {
            System.out.println(name + " için puan girilmedi.");
            return;
        }

        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double average = (double) total / scores.length;
        System.out.println(name + " için ortalama: " + average);
    }

    public static void main(String[] args) {
        printAverage("Ali", 85, 90, 78); // Üç puan
        printAverage("Ayşe", 88, 92); // İki puan
        printAverage("Mehmet"); // Hiç puan
    }
}
