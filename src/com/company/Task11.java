package com.company;

import java.util.Scanner;

public class Task11 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите 1-е число :");
    double num1 = scanner.nextDouble();
    String convert1 = String.valueOf(num1);
    Scanner scanner2 = new Scanner(System.in);
    System.out.println("Введите 2-е число :");
    double num2 = scanner2.nextDouble();
    int convert2 = (int) num2;

    double result = Math.max(num1, num2);
    System.out.println("Сравниваемые числа : " + num1 + " и " + num2);
    double convert3 = Double.valueOf(convert1);
    int convert4 = (int) convert3;
    int result2 = Math.min(convert2, convert4);
    double result3 = (double) result2;
    if (num1 == num2) {
      System.out.print("Числа равны ");
    } else {
      System.out.println("Большее число = " + result);
      System.out.println("Меньшее число = " + result3);
    }
  }
}

