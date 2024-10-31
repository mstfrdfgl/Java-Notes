package org.example.Arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};

        int searchValue = 5;
        // Arrays.binarySearch sadece sıralı dizilerde uygulanabilir.
        // Dizinin sıralı olduğunu varsayarak binary search yapıyoruz
        int index = Arrays.binarySearch(numbers, searchValue);
        if (index >= 0) {
            System.out.println("Aranan değer " + searchValue + " dizide " + index + ". indekste bulundu.");
        } else {
            System.out.println("Aranan değer " + searchValue + " dizide bulunamadı.");
        }
    }
}
