package org.example.algorithms.sorting;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Key'i uygun yere yerleştir
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        insertionSort(array);

        System.out.println("Sıralanmış dizi:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
