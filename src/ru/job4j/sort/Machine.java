package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int ras = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (ras >= coins[i]) {
                ras = ras - coins[i];
                rsl[size] = coins[i];
                size = size + 1;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}