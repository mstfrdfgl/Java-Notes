package org.example.Arrays;

import java.util.Arrays;

public class BinarySearchInSortedArray {
    public static void main(String[] args) {
        int[] sortedNumbers = {2, 4, 6, 8, 10, 12};

        int searchValue = 8;

        // Dizinin sıralı olduğunu varsayarak ikili arama yapıyoruz
        int index = Arrays.binarySearch(sortedNumbers, searchValue);

        if (index >= 0) {
            System.out.println("Aranan değer " + searchValue + " dizide " + index + ". indekste bulundu.");
        } else {
            System.out.println("Aranan değer " + searchValue + " dizide bulunamadı.");
        }
    }
}
