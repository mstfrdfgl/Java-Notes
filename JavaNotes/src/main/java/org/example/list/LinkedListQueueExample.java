package org.example.list;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {
    public static void main(String[] args) {
        // Queue olarak LinkedList oluşturma
        Queue<String> queue = new LinkedList<>();

        // Kuyruğa eleman ekleme
        queue.offer("Mustafa");
        queue.offer("Ahmet");
        queue.offer("Ayşe");

        System.out.println("Queue: " + queue);

        // Kuyruğun başındaki elemanı görme
        String firstInQueue = queue.peek();
        System.out.println("First in queue (peek): " + firstInQueue);

        // Kuyruktan eleman çıkarma
        String removedElement = queue.poll();
        System.out.println("Removed from queue (poll): " + removedElement);

        // Kuyruğun yeni durumu
        System.out.println("Queue after poll: " + queue);
    }
}
