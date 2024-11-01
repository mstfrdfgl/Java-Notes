package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        // Autoboxing: int'i Integer nesnesine dönüştürme
        int primitiveInt = 10;
        Integer wrappedInt = primitiveInt; // Otomatik dönüştürme
        System.out.println("Autoboxed Integer: " + wrappedInt);

        // Unboxing: Integer nesnesini int'e dönüştürme
        Integer anotherWrappedInt = 20; // Otomatik olarak autoboxed
        int unwrappedInt = anotherWrappedInt; // Otomatik dönüşüm
        System.out.println("Unboxed int: " + unwrappedInt);

        // Autoboxing ve Unboxing ile List kullanma
        List<Integer> integerList = new ArrayList<>();
        integerList.add(wrappedInt); // Autoboxing
        integerList.add(unwrappedInt); // Unboxing ile ekleme

        // List içerisindeki tüm elemanları yazdırma
        System.out.println("Integer List: " + integerList);
    }
}
