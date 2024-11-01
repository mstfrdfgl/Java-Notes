package org.example.arrays;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 3, 8, 6};

        System.out.println("Sıralama Öncesi Dizi: " + Arrays.toString(numbers));

        // Diziyi sıralıyoruz
        Arrays.sort(numbers);

        System.out.println("Sıralama Sonrası Dizi: " + Arrays.toString(numbers));
    }
}
