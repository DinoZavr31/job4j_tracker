package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(4, 0.001));
    }

    @Test
    public void distance3d() {
        Point c = new Point(0, 0, 0);
        Point d = new Point(0, 0, 0);
        double rsl = c.distance(d);
        assertThat(rsl, closeTo(0, 0.001));
    }
}