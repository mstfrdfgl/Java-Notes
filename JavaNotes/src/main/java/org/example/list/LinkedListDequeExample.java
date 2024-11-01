package org.example.list;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDequeExample {
    public static void main(String[] args) {
        // Deque olarak LinkedList oluşturma
        Deque<String> deque = new LinkedList<>();

        // Baştan ve sondan eleman ekleme
        deque.addFirst("Ali");
        deque.addLast("Veli");
        deque.addFirst("Ayşe");

        System.out.println("Deque after addFirst and addLast: " + deque);

        // Baştan ve sondan eleman çıkarma
        String firstRemoved = deque.removeFirst();
        String lastRemoved = deque.removeLast();

        System.out.println("Removed first: " + firstRemoved);
        System.out.println("Removed last: " + lastRemoved);
        System.out.println("Deque after removals: " + deque);

        // İlk ve son elemanı görme (silmeden)
        String firstInDeque = deque.getFirst();
        String lastInDeque = deque.getLast();

        System.out.println("First in deque (getFirst): " + firstInDeque);
        System.out.println("Last in deque (getLast): " + lastInDeque);
    }
}
