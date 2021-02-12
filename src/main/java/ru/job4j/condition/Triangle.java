package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        String rsl = (Triangle.exist(2, 5, 14)) ? "Треугольник существует" : "Треугольник не существует";
        System.out.println(rsl);
    }
}