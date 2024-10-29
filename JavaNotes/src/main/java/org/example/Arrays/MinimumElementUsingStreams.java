package org.example.Arrays;

import java.util.Arrays;

public class MinimumElementUsingStreams {
    public static int findMinimum(int[] numbers) {
        return Arrays.stream(numbers) // Diziyi bir stream'e dönüştür
                .min()           // Stream'de minimum değeri bul
                .orElseThrow(() -> new IllegalArgumentException("Dizi boş olamaz.")); // Boş dizi kontrolü
    }

    public static void main(String[] args) {
        int[] numbers = {12, 3, 19, 5, 1};
        System.out.println("Dizideki en küçük eleman: " + findMinimum(numbers)); // 1
    }
}
