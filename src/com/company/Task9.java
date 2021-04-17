package com.company;

import java.util.Scanner;

public class Task9 {


  public static void main(String[] args) {

    //!!!Прошу обратить внимание, в моем случае ввод чисел типа double работал  через запятую "," - например: 10,1 и т.д. На некоторых других устройствах работало через точку - 10.1 и т.д.

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите длину массива: ");
    double[] array = new double[sc.nextInt()];
    System.out.println("Заполните элементами ваш массив: ");
    for (int i = 0; i < array.length; i++) {
      array[i] = sc.nextDouble();
    }
    double result = 0;
    for (double d : array) {
      result += d;
    }
    System.out.println("Среднее арифметическое: " + result / array.length);
    for (double d : array) {
      System.out.println("Результат умножения на СА: " + d * (result / array.length));
    }
  }
}
