package org.example.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArrayUsingStreams {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5}; // Orijinal dizi

        // Stream kullanarak diziyi ters çevir
        List<Integer> reversedList = Arrays.stream(numbers)
                .collect(Collectors.toList()); // Diziyi listeye çevir
        Collections.reverse(reversedList); // Listeyi ters çevir

        System.out.println("Ters çevrilmiş dizi: " + reversedList); // Ters çevrilmiş diziyi yazdır
        // Çıktı: Ters çevrilmiş dizi: [5, 4, 3, 2, 1]
    }
}
