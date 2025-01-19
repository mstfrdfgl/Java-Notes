package org.example.list;

import org.example.functions.RandomList;

import java.util.*;

public class methods {
    public static void main(String[] args) {
        List<Integer> sayilar = RandomList.getRandomIntegerList(10);
        List<String> kelimeler = RandomList.getRandomStringList(4);
        System.out.println("sayı listesi: " + sayilar);
        System.out.println("toplam: " + toplam(sayilar));//toplam method
        System.out.println("tek sayılar: " + tersSayilariAyikla(sayilar));
        System.out.println("eşsiz sayılar: " + essizElemanlariBul(sayilar));
        System.out.println("kelime listesi: " + kelimeler);
        System.out.println("ters çevrilmiş liste: " + kelimeleriTersCevir(kelimeler));
        System.out.println("sağa kaydırılmış liste " + listeyiSagaKaydir(sayilar, 4));
    }

    public static int toplam(List<Integer> sayilar) {
        int sayilarinToplami = 0;
        for (Integer sayi : sayilar) {
            sayilarinToplami += sayi;
        }
        return sayilarinToplami;
    }

    public static List<Integer> tersSayilariAyikla(List<Integer> sayilar) {
        List<Integer> tersSayilar = new ArrayList<>();
        for (Integer sayi : sayilar) {
            if (sayi % 2 == 1) {
                tersSayilar.add(sayi);
            }
        }
        return tersSayilar;
    }

    public static List<String> kelimeleriTersCevir(List<String> kelimeler) {
        List<String> strings = new ArrayList<>();
        for (String kelime : kelimeler) {
            StringBuilder str = new StringBuilder();
            str.append(kelime);
            str.reverse();
            strings.add(String.valueOf(str));

        }
        return strings;
    }

    public static List<Integer> essizElemanlariBul(List<Integer> sayilar) {
        List<Integer> essizElemanlar = new ArrayList<>();
        int tekrar = 0;
        for (int i = 0; i < sayilar.size(); i++) {
            int temp = sayilar.get(i);
            for (Integer integer : sayilar) {
                if (temp == integer) {
                    tekrar++;
                }
            }
            if (tekrar == 1) {
                essizElemanlar.add(temp);
            }
            tekrar = 0;
        }
        return essizElemanlar;
    }

    public static List<Integer> listeyiSagaKaydir(List<Integer> sayilar, int n) {
        int nMod = n % sayilar.size();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> mergedList = new ArrayList<>();
        for (int i = sayilar.size() - 1; i > sayilar.size() - 1 - nMod; i--) {
            list1.add(sayilar.get(i));
        }
        for (int i = 0; i < sayilar.size() - nMod; i++) {
            list2.add(sayilar.get(i));
        }
        mergedList.addAll(list1.reversed());
        mergedList.addAll(list2);
        return mergedList;
    }

}
