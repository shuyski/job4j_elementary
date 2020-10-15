package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
       // float rsl = value/60;
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(180);
        int expected = 2;
        boolean passed = expected == euro;
        expected = 3;
        boolean passed1 = expected == dollar;
        System.out.println("140 rubles are " + euro + " euro." + "Test result :" + passed);
        System.out.println("180 rubles are " + dollar + " dollars." + "Test result :" + passed1);
    }
}