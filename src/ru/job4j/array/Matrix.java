package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {

        int[][] table = new int[size][size];
        int valueI = 1;

        for (int i = 0; i < size; i++) {
            int valueJ = 1;
            for (int j = 0; j < size; j++) {
                table[i][j] = valueI * valueJ;
                valueJ++;
            }
            valueI++;
        }

        return table;
    }
}
