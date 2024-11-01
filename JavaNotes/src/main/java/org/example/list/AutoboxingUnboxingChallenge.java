package org.example.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutoboxingUnboxingChallenge {
    public static void main(String[] args) {
        // Kullanıcıdan tamsayıları almak için bir Scanner oluşturma
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();
        String input;

        System.out.println("Enter integers (type 'done' to finish):");

        // Kullanıcıdan tamsayı girişi alma
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break; // 'done' girildiğinde döngüden çık
            }
            try {
                int number = Integer.parseInt(input); // String'i int'e dönüştürme
                numberList.add(number); // Autoboxing ile Integer nesnesine ekleme
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer."); // Geçerli bir tamsayı girişi kontrolü
            }
        }

        // Liste elemanlarının toplamını ve ortalamasını hesaplama
        int sum = 0;
        for (Integer num : numberList) {
            sum += num; // Unboxing işlemi
        }

        double average = numberList.isEmpty() ? 0 : (double) sum / numberList.size(); // Ortalamayı hesaplama

        // Sonuçları yazdırma
        System.out.println("Total sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close(); // Scanner'ı kapatma
    }
}
