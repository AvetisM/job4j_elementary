package ru.job4j.exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {

    public static boolean generateBy(String origin, String line) {
        boolean res = true;
        String[] originArray = origin.split("(?=[,.!;])|\\s+");
        Set<String> originSet = new HashSet<>(Arrays.asList(originArray));
        String[] lineArray = line.split(" ");
        for (String word: lineArray) {
            if (!originSet.contains(word)) {
                res = false;
                break;
            }
        }
        return res;
    }
}
