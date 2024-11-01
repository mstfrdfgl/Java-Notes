package org.example.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        // Array (Dizi) ile Çalışma
        String[] fruitsArray = new String[3];  // Sabit boyutlu
        fruitsArray[0] = "Apple";
        fruitsArray[1] = "Banana";
        fruitsArray[2] = "Cherry";
        System.out.println("Array: " + Arrays.toString(fruitsArray));

        // ArrayList ile Çalışma
        ArrayList<String> fruitsList = new ArrayList<>();  // Dinamik boyutlu
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Cherry");
        fruitsList.add("Mango");  // Yeni eleman eklenebiliyor
        System.out.println("ArrayList: " + fruitsList);

        // Array'de eleman değiştirme
        fruitsArray[1] = "Blueberry";
        System.out.println("Updated Array: " + Arrays.toString(fruitsArray));

        // ArrayList'te eleman değiştirme
        fruitsList.set(1, "Blueberry");
        System.out.println("Updated ArrayList: " + fruitsList);

        // Array'de boyut değiştirme - yapılamaz, sadece yeni bir dizi oluşturabiliriz.
        // ArrayList'te boyut değiştirme - otomatik olarak dinamik

        // Array'de eleman arama (daha manuel bir yöntem)
        boolean foundInArray = Arrays.asList(fruitsArray).contains("Cherry");
        System.out.println("Cherry in Array: " + foundInArray);

        // ArrayList'te eleman arama
        boolean foundInArrayList = fruitsList.contains("Cherry");
        System.out.println("Cherry in ArrayList: " + foundInArrayList);
    }
}
