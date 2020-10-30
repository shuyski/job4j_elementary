package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{3}, {50, 60}, {75, 21, 9}, {44, 5, 43, 66}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива " + i + " равен: " + numbers[i].length
            );
        }
    }
}