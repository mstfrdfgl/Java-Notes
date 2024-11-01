package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxingWList {
    public static void main(String[] args) {
        // Integer türünde bir ArrayList oluşturma
        List<Integer> integerList = new ArrayList<>();

        // Autoboxing: int değerlerini listeye ekleme
        for (int i = 1; i <= 5; i++) {
            integerList.add(i); // Otomatik olarak autoboxed Integer nesnesine dönüştürülüyor
        }

        // Listedeki elemanları yazdırma
        System.out.println("Integer List: " + integerList);

        // Unboxing: Liste elemanlarını int türüne döndürme
        for (Integer wrappedInt : integerList) {
            int primitiveInt = wrappedInt; // Otomatik olarak unboxed
            System.out.println("Unboxed int: " + primitiveInt);
        }

        // Liste elemanlarının toplamını hesaplama
        int sum = 0;
        for (Integer wrappedInt : integerList) {
            sum += wrappedInt; // Unboxing işlemi
        }
        System.out.println("Sum of the integers in the list: " + sum);
    }
}
