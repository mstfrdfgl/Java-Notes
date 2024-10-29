package org.example.Arrays;

public class ReferenceType {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = numbers1; // numbers1'in referansı numbers2'ye atanıyor

        numbers2[0] = 10; // numbers2'nin ilk elemanı değiştirilirse numbers1 de etkilenir

        System.out.println("numbers1 Dizisi: " + java.util.Arrays.toString(numbers1)); // [10, 2, 3]
        System.out.println("numbers2 Dizisi: " + java.util.Arrays.toString(numbers2)); // [10, 2, 3]
    }
}
