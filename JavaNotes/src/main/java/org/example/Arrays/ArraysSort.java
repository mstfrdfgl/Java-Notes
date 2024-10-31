package org.example.Arrays;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 4, 3, 2};

        // Sıralama işleminden önce diziyi yazdıralım
        System.out.println("Sıralama Öncesi: " + Arrays.toString(numbers));

        // Diziyi sıralayalım
        Arrays.sort(numbers);

        // Sadece belirli index aralığındakileri sıralayalım
        Arrays.sort(numbers, 1, 5);

        // Sıralama işleminden sonra diziyi yazdıralım
        System.out.println("Sıralama Sonrası: " + Arrays.toString(numbers));
    }
}
