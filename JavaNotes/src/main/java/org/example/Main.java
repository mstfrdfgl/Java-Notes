package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Random random = new Random();
        int length = random.nextInt(2, 12);
        System.out.println("arr length: " + length);
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            int randomNum = random.nextInt(1, 20);
            System.out.println("num " + i + ": " + randomNum);
            arr[i] = randomNum;
        }
        System.out.println("original array: " + Arrays.toString(arr));
        System.out.println("reverse sorted array: " + Arrays.toString(reverseSort(arr)));

    }

    public static int[] reverseSort(int[] arr) {
        Arrays.sort(arr);
        int[] reverseSortedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseSortedArray[i] = arr[arr.length - 1 - i];
        }
        return reverseSortedArray;
    }
}