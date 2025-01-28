package org.example.algorithms.sorting;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Minimum elemanın indeksi
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Minimum elemanı başa taşı
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};

        System.out.println("Sıralama öncesi:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        selectionSort(numbers);

        System.out.println("\nSıralama sonrası:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

