package org.example.arrays;

import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        // ArrayList kullanarak dinamik bir integer listesi oluşturuyoruz
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        // Listeye eleman ekliyoruz
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);

        // Listenin boyutunu ve elemanlarını yazdırma
        System.out.println("ArrayList Elemanları: " + dynamicArray);
        System.out.println("Boyut: " + dynamicArray.size());

        // Eleman güncelleme
        dynamicArray.set(0, 10); // İlk elemanı 10 olarak güncelliyoruz
        System.out.println("Güncellenmiş ArrayList: " + dynamicArray);

        // Eleman kaldırma
        dynamicArray.remove(1); // İkinci elemanı kaldırıyoruz
        System.out.println("Eleman Kaldırıldıktan Sonra ArrayList: " + dynamicArray);
    }
}
