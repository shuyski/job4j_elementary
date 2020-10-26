package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        if (array.length - 1 % 2 == 0) {
            for (int index = 0; index < array.length - index - 1; index++) {
                int temp = array[index];
                array[index] = array[array.length - index - 1];
                array[array.length - index - 1] = temp;
                if (array.length - index - 1 - index == 1) {
                    break;
                }
            }
        } else {
                for (int index = 0; index < array.length - index - 1; index++) {
                    int temp = array[index];
                    array[index] = array[array.length - index - 1];
                    array[array.length - index - 1] = temp;
                    if (array.length - index - 1 - index == 2) {
                        break;
                    }
                }
            }
        return array;
    }
}
