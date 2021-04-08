package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {
    @Test
    public void when4on4() {
        int size = 4;
        int[][] resMatrix = Matrix.multiple(size);
        int[][] expected = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12},
                {4, 8, 12, 16}
        };
        assertArrayEquals(expected, resMatrix);

    }

    @Test
    public void when5on5() {
        int size = 5;
        int[][] resMatrix = Matrix.multiple(size);
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}
        };

    }
}