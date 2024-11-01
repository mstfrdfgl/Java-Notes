package org.example.arrays;

public class MultiDimensionalArrayAccess {
    public static void main(String[] args) {
        int[][][] threeDArray = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {10, 11, 12},
                        {13, 14, 15},
                        {16, 17, 18}
                }
        };

        // Belirli bir elemana erişim
        int element = threeDArray[1][2][1]; // 2. katman, 3. satır, 2. sütundaki elemana erişim (17)
        System.out.println("Erişilen eleman: " + element); // Çıktı: Erişilen eleman: 17
    }
}
