package org.example.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomList {
    public static List<Integer> getRandomIntegerList(int len) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(random.nextInt(101));
        }
        return list;
    }

    public static List<String> getRandomStringList(int len){
        List<String> words = new ArrayList<>(Arrays.asList(
                // Gunluk Esyalar
                "telefon", "bilgisayar", "kalem", "kitap", "masa", "sandalye", "saat", "gozluk", "canta", "anahtar",
                // Yiyecek & Icecek
                "elma", "portakal", "ekmek", "sut", "cay", "kahve", "su", "peynir", "domates", "salatalik",
                // Giyim
                "pantolon", "gomlek", "ayakkabi", "ceket", "sapka", "eldiven", "corap", "etek", "kemer", "tisort",
                // Doga
                "agac", "cicek", "deniz", "gokyuzu", "gunes", "yildiz", "bulut", "yagmur", "kar", "ruzgar",
                // Hayvanlar
                "kedi", "kopek", "kus", "balik", "aslan", "fil", "zurafa", "tavsan", "kaplumbaga", "sincap",
                // Meslekler
                "doktor", "ogretmen", "muhendis", "asci", "pilot", "sofor", "hemsire", "avukat", "polis", "futbolcu",
                // Renkler
                "mavi", "kirmizi", "yesil", "sari", "beyaz", "siyah", "mor", "turuncu", "pembe", "kahverengi",
                // Mekanlar
                "ev", "okul", "hastane", "park", "market", "kutuphane", "restoran", "sinema", "muze", "stadyum",
                // Tasitlar
                "araba", "otobus", "tren", "ucak", "bisiklet", "motosiklet", "gemi", "helikopter", "metro", "tramvay",
                // Diger
                "muzik", "spor", "film", "oyun", "dans", "resim", "fotograf", "internet", "televizyon", "radyo",
                // Duygular
                "mutluluk", "huzun", "korku", "sevinc", "heyecan", "ofke", "sevgi", "umut", "merak", "saskinlik"
        ));
        Random random=new Random();
        List<Integer> randomNumbers=new ArrayList<>();
        List<String> randomStrings=new ArrayList<>();
        for(int i=0;i<len;i++){
//            randomNumbers.add(random.nextInt(99));
            randomStrings.add(words.get(random.nextInt(100)));
        }
        return randomStrings;
    }
}
