package org.example.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReversSortedArray {
    public static void main(String[] args) {
        Integer[] numbers = {10, 5, 3, 8, 6};

        // Diziyi küçükten büyüğe sıralıyoruz
        Arrays.sort(numbers);
        System.out.println("Küçükten Büyüğe Sıralı Dizi: " + Arrays.toString(numbers));

        // Diziyi tersine çeviriyoruz
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Büyükten Küçüğe Sıralı Dizi: " + Arrays.toString(numbers));
    }
}
