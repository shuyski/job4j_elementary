package ru.job4j.condition;

class MultipleSwitchWeek {

    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскреcенье", "Sunday" -> 7;
            default -> -1;
        };

    }
    //

    public static void main(String[] args) {
        int nomer = MultipleSwitchWeek.numberOfDay("Friday");
        System.out.println(nomer);
    }

}