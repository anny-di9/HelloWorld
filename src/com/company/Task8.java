package com.company;

import java.util.Scanner;

public class Task8 {

  public static void main(String[] args) {

    System.out.println("Введите целое положительное число :");
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    if (number <= 0) {
      return;
    }
    int result = 0;
    for (int i = 1; i <= number; i++) {
      if (i % 2 != 0) {
        result += i;
      }
    }
    System.out.println("Сумма нечетных чисел введенного числа равна = " + result);
  }
}


