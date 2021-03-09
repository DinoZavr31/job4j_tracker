package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void max() {
        int expected = 3;
        int out = Max.max(3, 2, 1, 0);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void max1() {
        int expected = 5;
        int out = Max.max(3, 2, 1, 5);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void max2() {
        int expected = 5;
        int out = Max.max(3,5);
        Assert.assertEquals(expected, out);
    }
}