package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList oluşturma
        List<String> fruits = new ArrayList<>();

        // ArrayList'e eleman ekleme
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Elemanları yazdırma
        System.out.println("Fruits list: " + fruits);

        // Belirli bir pozisyonda eleman ekleme
        fruits.add(1, "Mango");  // 1. pozisyona Mango ekle
        System.out.println("Updated fruits list: " + fruits);

        // Belirli bir pozisyondaki elemanı alma
        String firstFruit = fruits.getFirst();  // İlk elemanı al
        System.out.println("First fruit: " + firstFruit);

        // ArrayList boyutunu öğrenme
        System.out.println("Number of fruits: " + fruits.size());

        // ArrayList'ten eleman kaldırma
        fruits.remove("Banana");  // Banana öğesini kaldır
        System.out.println("After removal: " + fruits);
    }
}
