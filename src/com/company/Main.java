package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Переменные с плавающими точками с наибольшими диапазонами (положительные и отрицательные значения):
        double maxPositiveDouble = 1.7e+308;
        double maxNegativeDouble = -1.7e-308;
        double doubleNumber = 3.1416;

        float maxPositiveFloat = 3.4e+38f;
        float maxNegativeFloat = -3.4e-38f;
        float floatNumber = 13.15f;

        System.out.println("Переменные с плавающими точками с наибольшими диапазонами: " + maxPositiveDouble + "; " + maxNegativeDouble + "; " + maxPositiveFloat + "; " + maxNegativeFloat);
        System.out.println("Произвольные дробные значения: " + doubleNumber + "; " + floatNumber);

        byte minValueByte = -128;
        short minValueShort = -32768;
        int minValueInt = -2147483648;
        long minValueLong = -9223372036854775808L;
        System.out.println("Переменные целочисленного типа с наименьшим диапазоном чисел: " + minValueByte + "; " + minValueShort + "; " + minValueInt + "; " + minValueLong);

        byte maxValueByte = 127;
        short maxValueShort = 32767;
        int maxValueInt = 2147483647;
        long maxValueLong = 9223372036854775807L;
        System.out.println("Наибольшие возможные значения: " + maxValueByte + "; " + maxValueShort + "; " + maxValueInt + "; " + maxValueLong);

        //Тип данных Char- Если считать его целочисленным, то он - единственный в Java беззнаковый (unsigned) тип. Минимальное его значение 0, а максимальное - 65_535.
        char maxValueChar = 65535;
    }
}