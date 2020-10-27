package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        int j = 0;
        for (int i = 0; i < data.length; i++) {
          j = data[i] == data[0] ? j + 1 : j - 1;
        }
        result = Math.abs(j) == data.length;
        return result;
    }
}
