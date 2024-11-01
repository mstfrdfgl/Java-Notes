package org.example.arrays;

public class VarargsOverloading {
    // Tek bir String alır
    public static void printNames(String name) {
        System.out.println("Tek isim: " + name);
    }

    // Varargs ile birden fazla String alabilir
    public static void printNames(String... names) {
        System.out.println("Birden fazla isim: ");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        printNames("Ali"); // Tek isim: Ali
        printNames("Ali", "Ayşe", "Mehmet"); // Birden fazla isim: Ali, Ayşe, Mehmet
    }
}
