package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int j = 0;
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] == word[i]) {
                j = j + 1;
            }
        }
        result = j == pref.length;
        return result;
    }
}
