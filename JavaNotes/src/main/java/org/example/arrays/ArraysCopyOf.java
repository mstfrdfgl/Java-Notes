package org.example.arrays;

import java.util.Arrays;

public class ArraysCopyOf {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};

        // Dizinin ilk 3 elemanını kopyalayalım
        int[] partialCopy = Arrays.copyOf(original, 3);

        // Dizinin tamamını kopyalayalım
        int[] fullCopy = Arrays.copyOf(original, original.length);

        // Sonuçları yazdıralım
        System.out.println("Orijinal Dizi: " + Arrays.toString(original));
        System.out.println("Kısmi Kopya (ilk 3 eleman): " + Arrays.toString(partialCopy));
        System.out.println("Tam Kopya: " + Arrays.toString(fullCopy));
    }
}
