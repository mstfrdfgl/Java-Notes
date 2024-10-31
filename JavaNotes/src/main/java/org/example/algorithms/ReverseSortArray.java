package org.example.algorithms;

import java.util.Arrays;
import java.util.Random;

public class ReverseSortArray {
    public static void main(String[] args) {
        int[] arr = getRandomArray(5);
        System.out.println("original array: " + Arrays.toString(arr));
        int[] reversedArr = getReversedSortArray(arr);
        System.out.println("reversed sort array: " + Arrays.toString(reversedArr));
    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    public static int[] getReversedSortArray(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int[] reversedArr = new int[len];
        for (int i = 0; i < len; i++) {
            reversedArr[i] = arr[len - 1 - i];
        }
        return reversedArr;
    }
}
