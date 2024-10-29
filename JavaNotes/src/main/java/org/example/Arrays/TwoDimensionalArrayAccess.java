package org.example.Arrays;

public class TwoDimensionalArrayAccess {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        // Belirli bir elemana erişim
        int element = matrix[1][2]; // 2. satır, 3. sütundaki elemana erişim (60)
        System.out.println("Erişilen eleman: " + element); // Çıktı: Erişilen eleman: 60
    }
}
