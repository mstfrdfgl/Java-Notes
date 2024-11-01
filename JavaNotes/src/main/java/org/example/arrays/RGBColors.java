package org.example.arrays;

public class RGBColors {
    public static void main(String[] args) {
        // RGB renk değerlerini saklayan üç boyutlu dizi
        int[][][] colors = {
                {
                        {255, 0, 0}, // Kırmızı
                        {0, 255, 0}, // Yeşil
                        {0, 0, 255}  // Mavi
                },
                {
                        {255, 255, 0}, // Sarı
                        {255, 0, 255}, // Magenta
                        {0, 255, 255}  // Cyan
                }
        };

        // Renkleri yazdırma
        for (int i = 0; i < colors.length; i++) {
            System.out.println("Renk " + (i + 1) + ":");
            for (int j = 0; j < colors[i].length; j++) {
                System.out.println("RGB: " + colors[i][j][0] + ", " + colors[i][j][1] + ", " + colors[i][j][2]);
            }
            System.out.println(); // Boş satır
        }
    }
}
