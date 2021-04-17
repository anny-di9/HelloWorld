package com.company;

import java.util.Scanner;

public class Task11 {

  public static void main(String[] args) {

    System.out.println("Введите первое число: ");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println("Ваше число в String: " + s);
    int si = Integer.parseInt(s);

    System.out.println("Введите второе число: ");
    int i = sc.nextInt();
    System.out.println("Ваше число в int: " + i);

    if (si > i) {
      System.out.println("Первый int больше : " + si);
      System.out.println("Второй int совпадает с double: " + i * 1.0);
    } else if (si < i) {
      System.out.println("Второй int больше: " + i);
      System.out.println("Первый int совпадает с double: " + si * 1.0);
    } else {
      System.out.println("Значения равны");
    }
  }
}

