package org.example.Arrays;

public class ArraysPart1 {
    public static void main(String[] args) {
        // 1. Integer türünde bir dizi tanımlıyoruz ve bellekte yer ayırıyoruz
        int[] numbers = new int[5]; // 5 elemanlı boş bir integer dizisi oluşturulur

        // 2. Diziyi elemanlarla başlatma
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // 3. Diziyi doğrudan elemanları ile birlikte tanımlama
        int[] directNumbers = {5, 10, 15, 20, 25};

        // Diziyi yazdırma
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}
