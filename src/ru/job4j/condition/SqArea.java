package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double rsl = 2*(p/(2*(k+1)))*k;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}