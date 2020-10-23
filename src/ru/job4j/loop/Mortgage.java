package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        int i = (int) percent;
        while (amount > 0) {
         amount = (amount + amount * i / 100) - salary;
         year += 1;

        }

        return year;
    }

}