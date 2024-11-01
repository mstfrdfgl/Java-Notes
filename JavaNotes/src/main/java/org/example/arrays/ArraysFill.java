package org.example.arrays;

import java.util.Arrays;

public class ArraysFill {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // 5 elemanlı bir dizi tanımladık

        // Diziyi 7 değeri ile güncelleyelim
        Arrays.fill(numbers, 7);

        // Doldurulmuş diziyi yazdıralım
        System.out.println("Dizi: " + Arrays.toString(numbers));
    }
}
