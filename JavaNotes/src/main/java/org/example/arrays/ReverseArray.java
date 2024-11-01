package org.example.arrays;

public class ReverseArray {
    // Metot: Diziyi ters çevirir
    public static void reverse(int[] array) {
        int start = 0; // Başlangıç indeksi
        int end = array.length - 1; // Bitiş indeksi

        while (start < end) { // Başlangıç indeksi bitiş indeksinden küçük olduğu sürece
            // Elemanları yer değiştir
            int temp = array[start]; // Başlangıçtaki elemanı geçici bir değişkene al
            array[start] = array[end]; // Son elemanı başlangıç konumuna yerleştir
            array[end] = temp; // Geçici değişkende saklanan elemanı sona yerleştir

            start++; // Başlangıç indeksini bir artır
            end--; // Bitiş indeksini bir azalt
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Orijinal dizi
        reverse(numbers); // Diziyi ters çevir
        System.out.println("Ters çevrilmiş dizi: ");
        for (int number : numbers) { // Ters çevrilmiş diziyi yazdır
            System.out.print(number + " ");
        }
        // Çıktı: 5 4 3 2 1
    }
}
