package org.example.arrays;

import java.util.Arrays;

public class ArrayMatch {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};

        int searchValue = 5;

        // Döngü kullanarak eşleşme bulma
        boolean found = false;
        for (int number : numbers) {
            if (number == searchValue) {
                found = true;
                break;
            }
        }

        // Arrays.stream() ile eşleşme bulma
        boolean foundWithStream = Arrays.stream(numbers).anyMatch(n -> n == searchValue);

        System.out.println("Döngü ile eşleşme bulundu mu? " + found);
        System.out.println("Stream ile eşleşme bulundu mu? " + foundWithStream);
    }
}
