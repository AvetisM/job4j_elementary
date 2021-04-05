package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqLastTest {
    @Test
    public void whenEqual() {
        int[] left = {3, 4, 5, 12, 7};
        int[] right = {13, 14, 7};
        boolean res = EqLast.check(left, right);
        Assert.assertTrue(res);
    }

    @Test
    public void whenNotEqual() {
        int[] left = {3, 4, 8};
        int[] right = {13, 14, 7};
        boolean res = EqLast.check(left, right);
        Assert.assertFalse(res);
    }
}