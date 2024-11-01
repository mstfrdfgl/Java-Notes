package org.example.functions;

import java.util.Random;

public class RandomArray {
    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
