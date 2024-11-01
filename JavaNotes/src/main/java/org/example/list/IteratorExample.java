package org.example.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        // ArrayList oluşturma ve eleman ekleme
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Iterator oluşturma
        Iterator<String> iterator = fruits.iterator();

        // Elemanları gezme
        System.out.println("Fruits in the list:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        // Eleman çıkarma
        iterator = fruits.iterator(); // Iterator'u sıfırlama
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("Banana")) {
                iterator.remove(); // "Banana" elemanını çıkar
            }
        }

        // Güncellenmiş listeyi yazdırma
        System.out.println("After removing Banana: " + fruits);
    }
}
