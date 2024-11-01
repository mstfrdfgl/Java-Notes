package org.example.arrays;

public class Varargs {
    // Varargs kullanarak değişken sayıda int parametre alabilen bir metot
    public static int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number; // Her sayıyı toplama ekliyoruz
        }
        return total;
    }

    public static void main(String[] args) {
        // sum metoduna farklı sayıda parametreler gönderebiliriz
        System.out.println("Toplam (2 sayı): " + sum(10, 20)); // 30
        System.out.println("Toplam (3 sayı): " + sum(5, 15, 25)); // 45
        System.out.println("Toplam (4 sayı): " + sum(1, 2, 3, 4)); // 10
    }
}
