package org.example.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // LinkedList tanımlama ve oluşturma
        LinkedList<String> cities = new LinkedList<>();

        // Başa ve sona eleman ekleme
        cities.add("Istanbul");     // Sonuna ekler
        cities.addFirst("Ankara");  // Başına ekler
        cities.addLast("Izmir");    // Sonuna ekler
        cities.add("Bursa");        // Sonuna ekler
        System.out.println("Cities: " + cities);

        // Belirli bir konuma eleman ekleme
        cities.add(2, "Antalya");   // 2. indeks konumuna ekler
        System.out.println("After adding Antalya at index 2: " + cities);

        // Baştan ve sondan eleman çıkarma
        cities.removeFirst(); // İlk elemanı çıkarır
        System.out.println("After removing first element: " + cities);

        cities.removeLast();  // Son elemanı çıkarır
        System.out.println("After removing last element: " + cities);

        // Belirli bir elemanı çıkarma
        cities.remove("Izmir"); // "Izmir" elemanını çıkarır
        System.out.println("After removing Izmir: " + cities);

        // İlk ve son elemanı alma
        String firstCity = cities.getFirst(); // İlk elemanı alır
        String lastCity = cities.getLast();   // Son elemanı alır
        System.out.println("First City: " + firstCity + ", Last City: " + lastCity);
    }
}
