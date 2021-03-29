package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int out = 120;
        int res = Factorial.calc(n);
        Assert.assertEquals(out, res);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int out = 1;
        int res = Factorial.calc(n);
        Assert.assertEquals(out, res);
    }
}