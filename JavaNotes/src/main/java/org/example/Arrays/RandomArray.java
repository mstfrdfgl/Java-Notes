package org.example.Arrays;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static int[] getRandomArray(int len) {
        // Random sayılar alabilmek için random nesnesi oluşturduk.
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(1, 100);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
//        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray, 0, 3);
        System.out.println(Arrays.toString(firstArray));
    }
}
