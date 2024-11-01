package org.example.arrays;

import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {
        int[] numbers1 = {1, 3, 5, 7, 9};
        int[] numbers2 = {1, 3, 5, 7, 9};
        int[] numbers3 = {9, 7, 5, 3, 1};

        // İki dizinin eşit olup olmadığını test etme
        boolean isEqual1 = Arrays.equals(numbers1, numbers2);
        boolean isEqual2 = Arrays.equals(numbers1, numbers3);

        System.out.println("numbers1 ve numbers2 eşit mi? " + isEqual1); // true
        System.out.println("numbers1 ve numbers3 eşit mi? " + isEqual2); // false
    }
}
