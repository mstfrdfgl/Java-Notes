package org.example.arrays;

public class MinimumElement {
    // Metot: Minimum değeri bulur
    public static int findMinimum(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Dizi boş olamaz.");
        }

        int min = numbers[0]; // İlk elemanı minimum olarak varsayıyoruz

        for (int i = 1; i < numbers.length; i++) { // İlk eleman zaten min olduğundan i=1
            if (numbers[i] < min) { // Eğer mevcut eleman min'den küçükse
                min = numbers[i];   // min değişkenini bu elemana güncelle
            }
        }

        return min; // En küçük değer döndürülür
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 2, 8, 1}; // Bir dizi tanımlıyoruz
        System.out.println("Dizideki en küçük eleman: " + findMinimum(numbers)); // 1
    }
}
