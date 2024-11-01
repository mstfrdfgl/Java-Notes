package org.example.arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4]; // 3 satır, 4 sütun

        // Diziye eleman ekleme
        for (int i = 0; i < matrix.length; i++) { // Satırlar için döngü
            for (int j = 0; j < matrix[i].length; j++) { // Sütunlar için döngü
                matrix[i][j] = i * j; // Örnek bir değer atama
            }
        }

        // Dizi elemanlarını yazdırma
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " "); // Elemanları yazdır
            }
            System.out.println(); // Yeni satıra geç
        }
    }
}
