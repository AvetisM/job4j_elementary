package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {
    @Test
    public void whenArrayHas3ThenNotFound() {
        int[] data = {6, 8, 9, 7, 5};
        int el = 3;
        int result = FindLoop.indexOf(data, el);
        int expect = -1;
        Assert.assertEquals(expect, result);
    }

    @Test
    public void whenArrayHas7Then3() {
        int[] data = {6, 8, 9, 7, 5};
        int el = 7;
        int result = FindLoop.indexOf(data, el);
        int expect = 3;
        Assert.assertEquals(expect, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNotFind3() {
        int[] data = new int[] {5, 2, 18, 10, 2, 4};
        int el = 10;
        int start = 0;
        int finish = 2;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

}