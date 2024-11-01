package org.example.arrays;

public class ValueType {
    public static void main(String[] args) {
        int a = 5;
        int b = a; // a'nın değeri b'ye kopyalanıyor
        b = 10; // b'nin değeri değişse de a etkilenmez

        System.out.println("a'nın değeri: " + a); // 5
        System.out.println("b'nin değeri: " + b); // 10
    }
}
