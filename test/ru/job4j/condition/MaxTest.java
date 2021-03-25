package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void left5right10max10() {
        int left = 5;
        int right = 10;
        int expected = 10;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void left10right15max10() {
        int left = 10;
        int right = 5;
        int expected = 10;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void left5right5max5() {
        int left = 5;
        int right = 5;
        int expected = 5;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }
}