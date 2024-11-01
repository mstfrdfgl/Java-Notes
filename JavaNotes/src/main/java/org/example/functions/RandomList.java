package org.example.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList {
    public static List<Integer> getRandomList(int len) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }
}
