package org.example.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListChallenge2 {
    public static void main(String[] args) {
        // Kullanıcıdan isimler almak için bir LinkedList oluşturma
        LinkedList<String> names = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        // Kullanıcıdan isimleri alma
        System.out.println("Please enter names (type 'done' to finish):");
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break; // 'done' girildiğinde döngüden çık
            }
            names.add(input); // İsimleri listeye ekle
        }

        // İsimleri alfabetik sıraya göre sıralama
        Collections.sort(names);
        System.out.println("Sorted names: " + names);

        // İlk ve son ismi görüntüleme
        if (!names.isEmpty()) {
            System.out.println("First name: " + names.getFirst());
            System.out.println("Last name: " + names.getLast());
        }

        // Kullanıcıdan bir isim silme isteği
        System.out.println("Enter a name to remove:");
        input = scanner.nextLine();
        if (names.remove(input)) {
            System.out.println(input + " has been removed.");
        } else {
            System.out.println(input + " not found in the list.");
        }

        // İsimlerin güncellenmiş listesini yazdırma
        System.out.println("Updated names list: " + names);

        // Kullanıcıdan bir isim bulma isteği
        System.out.println("Enter a name to search for:");
        input = scanner.nextLine();
        if (names.contains(input)) {
            System.out.println(input + " is in the list.");
        } else {
            System.out.println(input + " is not in the list.");
        }

        scanner.close(); // Scanner'ı kapatma
    }
}
