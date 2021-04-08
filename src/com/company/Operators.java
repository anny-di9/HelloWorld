package com.company;

import java.util.Scanner;

public class Operators {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Введите число X: ");
    double X = in.nextDouble();
    System.out.print("Введите число Y: ");
    double Y = in.nextDouble();
    System.out.print("Введите число Z: ");
    double Z = in.nextDouble();
    double sum = (X + Y + Z) / 3;

    System.out.println("Среднее арифметическое: " + sum / 2);
    System.out.println("Округленное значение : " + Math.floor(sum));
    if (sum >= 3) {
      System.out.println("Программа выполнена корректно");
    } else {
      System.out.println("Программа выполнена некорректно! Попробуйте еще раз.");
    }
  }
}








