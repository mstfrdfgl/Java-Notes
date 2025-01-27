package org.example.algorithms.sorting;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Her geçişte bir eleman sona yerleşir
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Elemanları yer değiştir
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Sıralama öncesi:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        bubbleSort(numbers);

        System.out.println("\nSıralama sonrası:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

