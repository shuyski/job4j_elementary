package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        table[0][0] = 1;
        for (int i = 1; i < table.length; i++) {
            table[0][i] = table[0][i - 1] + 1;
            System.out.println(table[0][i]);
            table[i][0] = table[i - 1][0] + 1;
            System.out.println(table[i][0]);
            for (int j = 1; j < table.length; j++) {
                table[i][j] = table[i][i] * table[i][0];
                System.out.println(table[i][j]);
            }

        }

        return table;
    }
}