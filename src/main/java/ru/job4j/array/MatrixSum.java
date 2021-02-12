package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               rsl = rsl + array[i][j];
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[][] data = {{1, 2, 1}, {1, 2, 0}};
        System.out.println(MatrixSum.sum(data));
    }
}