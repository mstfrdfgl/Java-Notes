package org.example.arrays;

public class ArraysPart2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // 5 elemanlı bir integer dizisi oluşturuluyor

        // Dizinin ilk elemanını güncelleyelim
        numbers[0] = 10;

        // Dizinin elemanlarını toplayalım
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Dizinin ortalamasını hesaplayalım
        double average = (double) sum / numbers.length;

        // Sonuçları yazdıralım
        System.out.println("Dizinin Elemanları:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nToplam: " + sum);
        System.out.println("Ortalama: " + average);
    }
}
