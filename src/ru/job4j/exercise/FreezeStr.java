package ru.job4j.exercise;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {

    public static boolean eq(String left, String right) {

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

        for (Character key : charsRight) {

            if (!mapLeft.containsKey(key)) {

                return false;

            } else {

                int value = mapLeft.get(key);

                if (value == 1) {
                    mapLeft.remove(key);
                } else if (value > 1) {
                    mapLeft.put(key, value - 1);
                }

            }
        }
        return mapLeft.isEmpty();
    }
}
