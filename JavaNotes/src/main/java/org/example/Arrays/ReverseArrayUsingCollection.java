package org.example.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayUsingCollection {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5}; // Integer dizisi
        Collections.reverse(Arrays.asList(numbers)); // Collections.reverse kullanarak ters çevir
        System.out.println("Ters çevrilmiş dizi: " + Arrays.toString(numbers)); // Ters çevrilmiş diziyi yazdır
        // Çıktı: Ters çevrilmiş dizi: [5, 4, 3, 2, 1]
    }
}
