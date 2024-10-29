package org.example.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][][] threeDArray = new int[2][3][4]; // 2 katman, 3 satır, 4 sütun

        // Diziye eleman ekleme
        for (int i = 0; i < threeDArray.length; i++) { // Katmanlar için döngü
            for (int j = 0; j < threeDArray[i].length; j++) { // Satırlar için döngü
                for (int k = 0; k < threeDArray[i][j].length; k++) { // Sütunlar için döngü
                    threeDArray[i][j][k] = i + j + k; // Örnek bir değer atama
                }
            }
        }

        // Dizi elemanlarını yazdırma
        for (int i = 0; i < threeDArray.length; i++) {
            System.out.println("Katman " + i + ":");
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print(threeDArray[i][j][k] + " "); // Elemanları yazdır
                }
                System.out.println(); // Yeni satıra geç
            }
            System.out.println(); // Katmanlar arasında boş bir satır
        }
    }
}
