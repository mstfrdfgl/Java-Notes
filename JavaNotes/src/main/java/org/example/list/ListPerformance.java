package org.example.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformance {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Sona eleman ekleme (Append)
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList append time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList append time: " + (endTime - startTime) + " ns");

        // Ortaya eleman ekleme
        startTime = System.nanoTime();
        arrayList.add(50000, -1);
        endTime = System.nanoTime();
        System.out.println("ArrayList insert time (middle): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.add(50000, -1);
        endTime = System.nanoTime();
        System.out.println("LinkedList insert time (middle): " + (endTime - startTime) + " ns");

        // Eleman çıkartma
        startTime = System.nanoTime();
        arrayList.remove(50000);
        endTime = System.nanoTime();
        System.out.println("ArrayList remove time (middle): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.remove(50000);
        endTime = System.nanoTime();
        System.out.println("LinkedList remove time (middle): " + (endTime - startTime) + " ns");
    }
}
