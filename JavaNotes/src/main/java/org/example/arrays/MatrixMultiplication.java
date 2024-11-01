package org.example.arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrixB = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        // Sonuç matrisini tanımla
        int[][] result = new int[matrixA.length][matrixB[0].length];

        // Matris çarpımı
        for (int i = 0; i < matrixA.length; i++) { // matrixA'nın satırları
            for (int j = 0; j < matrixB[0].length; j++) { // matrixB'nin sütunları
                for (int k = 0; k < matrixA[0].length; k++) { // Çarpma işlemi için
                    result[i][j] += matrixA[i][k] * matrixB[k][j]; // Elemanları çarp ve topla
                }
            }
        }

        // Sonuç matrisini yazdırma
        System.out.println("Çarpan matris:");
        for (int[] row : result) {
            for (int element : row) {
                System.out.print(element + " "); // Elemanları yazdır
            }
            System.out.println(); // Yeni satıra geç
        }
    }
}
