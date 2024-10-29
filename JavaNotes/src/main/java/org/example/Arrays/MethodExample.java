package org.example.Arrays;

public class MethodExample {
    public static void main(String[] args) {
        int value = 5;
        modifyValue(value);
        System.out.println("Value (Değer Türü) Sonuç: " + value); // 5

        int[] array = {1, 2, 3};
        modifyArray(array);
        System.out.println("Array (Referans Türü) Sonuç: " + java.util.Arrays.toString(array)); // [10, 2, 3]
    }

    public static void modifyValue(int x) {
        x = 10; // Değer türü olduğu için sadece x'in kopyası değişir
    }

    public static void modifyArray(int[] arr) {
        arr[0] = 10; // Referans türü olduğu için orijinal dizi değişir
    }
}
