package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        for (int index = 0; index <= n; index++) {
            result = result != 0 ? result * index : 1;
        }
        return result;
    }

}