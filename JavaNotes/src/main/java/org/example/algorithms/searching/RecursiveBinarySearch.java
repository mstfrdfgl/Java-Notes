package org.example.algorithms.searching;

public class RecursiveBinarySearch {
    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1; // Eleman bulunamadı
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid; // Eleman bulundu
        } else if (array[mid] < target) {
            return binarySearch(array, target, mid + 1, right); // Sağ tarafa bak
        } else {
            return binarySearch(array, target, left, mid - 1); // Sol tarafa bak
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 20;

        int result = binarySearch(array, target, 0, array.length - 1);

        if (result == -1) {
            System.out.println("Eleman bulunamadı.");
        } else {
            System.out.println("Eleman " + result + ". indekste bulundu.");
        }
    }
}
