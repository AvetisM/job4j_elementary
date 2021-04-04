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

}