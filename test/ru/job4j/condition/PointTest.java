package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when11to22then2() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;

        double expected = 1.41;

        double out = Point.distance(x1, y1, x2, y2);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to56then4() {
        int x1 = 4;
        int y1 = 2;
        int x2 = 5;
        int y2 = 6;

        double expected = 4.12;

        double out = Point.distance(x1, y1, x2, y2);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1010to2020then14() {
        int x1 = 10;
        int y1 = 10;
        int x2 = 20;
        int y2 = 20;

        double expected = 14.15;

        double out = Point.distance(x1, y1, x2, y2);

        Assert.assertEquals(expected, out, 0.01);
    }
}