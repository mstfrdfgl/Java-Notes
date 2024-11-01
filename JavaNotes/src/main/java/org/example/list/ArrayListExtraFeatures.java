package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExtraFeatures {
    public static void main(String[] args) {
        // ArrayList oluşturma ve eleman ekleme
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Blue");  // Aynı elemanı birden fazla kez ekleyebiliriz

        System.out.println("Original Colors List: " + colors);

        // isEmpty() - Listenin boş olup olmadığını kontrol etme
        boolean isListEmpty = colors.isEmpty();
        System.out.println("Is colors list empty? " + isListEmpty);

        // indexOf() - İlk geçen elemanın indeksini bulma
        int firstIndexOfBlue = colors.indexOf("Blue");
        System.out.println("First index of 'Blue': " + firstIndexOfBlue);

        // lastIndexOf() - Son geçen elemanın indeksini bulma
        int lastIndexOfBlue = colors.lastIndexOf("Blue");
        System.out.println("Last index of 'Blue': " + lastIndexOfBlue);

        // Listeyi bir diziye dönüştürme
        String[] colorsArray = colors.toArray(new String[0]);
        System.out.println("Array from colors list:");
        for (String color : colorsArray) {
            System.out.print(color + " ");
        }
    }
}
