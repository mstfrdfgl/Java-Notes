package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAdvanceExample {
    public static void main(String[] args) {
        // ArrayList oluşturma ve eleman ekleme
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Bird");

        System.out.println("Original List: " + animals);

        // Eleman güncelleme (set)
        animals.set(2, "Elephant");  // 2. indeksteki 'Horse' yerine 'Elephant' ekle
        System.out.println("After update: " + animals);

        // Bir elemanın listede olup olmadığını kontrol etme (contains)
        boolean hasCat = animals.contains("Cat");
        System.out.println("List contains 'Cat': " + hasCat);

        // Tüm elemanları yazdırmak için döngü kullanma
        System.out.print("All animals: ");
        for (String animal : animals) {
            System.out.print(animal + " ");
        }
        System.out.println();

        // Listedeki tüm elemanları temizleme
        animals.clear();
        System.out.println("After clear, list size: " + animals.size());
    }
}
