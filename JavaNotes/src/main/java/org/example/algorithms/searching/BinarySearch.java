package org.example.algorithms.searching;

import java.util.Arrays;

public class BinarySearch {
    // İkili arama metodu
    public static int binarySearch(int[] array, int target) {
        int left = 0;                // Sol sınır
        int right = array.length - 1; // Sağ sınır

        while (left <= right) {
            // Orta noktayı hesapla
            int mid = left + (right - left) / 2;

            // Hedef orta noktada mı?
            if (array[mid] == target) {
                return mid;
            }
            // Hedef orta noktadan küçükse, sol yarıyı kontrol et
            else if (array[mid] > target) {
                right = mid - 1;
            }
            // Hedef orta noktadan büyükse, sağ yarıyı kontrol et
            else {
                left = mid + 1;
            }
        }

        // Hedef bulunamadıysa -1 döndür
        return -1;
    }

    public static void main(String[] args) {
        // Sıralı bir dizi
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;

        // Binary Search çağrısı
        int result = binarySearch(numbers, target);

        // Sonucu yazdır
        if (result != -1) {
            System.out.println("Eleman bulundu! İndeks: " + result);
        } else {
            System.out.println("Eleman dizide bulunamadı.");
        }
    }
}

