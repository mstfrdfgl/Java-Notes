package org.example.Arrays;

import java.util.Arrays;

public class MinimumElementUsingArrays {
    public static int findMinimum(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Dizi boş olamaz.");
        }

        Arrays.sort(numbers); // Dizi elemanlarını sıralıyoruz
        return numbers[0]; // İlk eleman minimum değer olur
    }

    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 4, 3};
        System.out.println("Dizideki en küçük eleman: " + findMinimum(numbers)); // 2
    }
}
