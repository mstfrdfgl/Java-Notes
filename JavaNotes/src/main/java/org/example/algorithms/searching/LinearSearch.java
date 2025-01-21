package org.example.algorithms.searching;

public class LinearSearch {
    // Doğrusal arama metodu
    public static int linearSearch(int[] array, int target) {
        // Dizi elemanlarını sırayla kontrol ediyoruz
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                // Eleman bulunduysa indeksini döndür
                return i;
            }
        }
        // Eleman bulunamazsa -1 döndür
        return -1;
    }

    public static void main(String[] args) {
        // Örnek bir dizi
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;

        // Arama işlemi
        int result = linearSearch(numbers, target);

        // Sonucu yazdır
        if (result != -1) {
            System.out.println("Eleman bulundu! İndeks: " + result);
        } else {
            System.out.println("Eleman dizide bulunamadı.");
        }
    }
}

