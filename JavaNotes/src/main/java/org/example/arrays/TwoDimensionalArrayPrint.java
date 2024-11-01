package org.example.arrays;

public class TwoDimensionalArrayPrint {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        // Dizi elemanlarını yazdırma
        for (int[] row : matrix) { // Her bir satır için döngü
            for (int element : row) { // Satırdaki her bir eleman için döngü
                System.out.print(element + " "); // Elemanları yazdır
            }
            System.out.println(); // Yeni satıra geç
        }
    }
}
