package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point that) {
        double rsl = sqrt(pow((this.x - that.x), 2) + pow((this.y - that.y), 2));
        return rsl;
    }

    public static void main(String[] args) {
        Point one = new Point(12, 14);
        Point two = new Point(3, 5);
        double result = one.distance(two);
        System.out.println("result (12, 14) to (3, 5) = " + result);
    }
}