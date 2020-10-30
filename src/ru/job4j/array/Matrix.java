package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        table[0][0] = 1;
        for (int i = 1; i < table.length; i++) {
            table[0][i] = table[0][i - 1] + 1;
            table[i][0] = table[i - 1][0] + 1;
            for (int j = 1; j < table.length; j++) {
                if (i == j) {
                    table[i][j] = table[0][i] * table[i][0];
                } else {
                    table[i][j] = (table[0][j] * table[i][0]);
                    table[j][i] = (table[0][j] * table[i][0]);
                    }
              }
        }
        return table;
    }
}