package ru.job4j.exercise;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {

    public static boolean eq(String left, String right) {
        boolean res = true;

        char[] charsLeft = left.toCharArray();
        char[] charsRight = right.toCharArray();

        Map<Character, Integer> mapLeft = new HashMap<>();
        for (Character key : charsLeft) {
            if (mapLeft.containsKey(key)) {
                mapLeft.put(key, mapLeft.get(key) + 1);
            } else {
                mapLeft.put(key, 1);
            }
        }
        Map<Character, Integer> mapRight = new HashMap<>();
        for (Character key : charsRight) {
            if (mapRight.containsKey(key)) {
                mapRight.put(key, mapRight.get(key) + 1);
            } else {
                mapRight.put(key, 1);
            }
        }

        for (Character key: mapRight.keySet()) {
            if (!mapLeft.containsKey(key) || !mapRight.get(key).equals(mapLeft.get(key))) {
                res = false;
            }
        }

        return res;
    }
}
