package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when2517to305then2624() {
        double expected = 26.24; //26.25
        int x1 = 25;
        int y1 = 30;
        int x2 = 17;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when1214to35then228() {
        double expected = 2.82; //2.83
        int x1 = 12;
        int y1 = 3;
        int x2 = 14;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when63to63then424() {
        double expected = 4.24; //4.25
        int x1 = 3;
        int y1 = 3;
        int x2 = 6;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}