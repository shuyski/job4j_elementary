package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        int i = 0;
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if (i % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
                i = i + 1;
            }
            /* добавляем перевод на новую строку. */
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(5, 4);
    }
}