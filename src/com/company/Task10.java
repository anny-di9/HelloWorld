package com.company;

import java.util.Scanner;

public class Task10 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите длину массива: ");
    int[][] array = new int[sc.nextInt()][sc.nextInt()];
    System.out.println("Заполните элементами ваш массив: ");
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        array[i][j] = sc.nextInt();
      }
    }
    for (int[] i : array) {
      for (int d : i) {
        System.out.print(d + " ");
      }
      System.out.println();
    }
    int[] res = array[1];
    for (double d : res) {
      System.out.println("Результат после умножения : " + (d * 3) + " ");
    }
  }
}