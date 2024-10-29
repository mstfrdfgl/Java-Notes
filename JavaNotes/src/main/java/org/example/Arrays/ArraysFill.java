package org.example.Arrays;

import java.util.Arrays;

public class ArraysFill {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // 5 elemanlı bir dizi tanımladık

        // Diziyi 7 değeri ile dolduralım
        Arrays.fill(numbers, 7);

        // Doldurulmuş diziyi yazdıralım
        System.out.println("Dizi: " + Arrays.toString(numbers));
    }
}
