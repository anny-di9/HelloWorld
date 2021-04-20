package com.company;

import java.util.Random;

public class Task14 {

  public static void main(String[] args) {

    int[] array = new int[15];
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(41) - 20;
      System.out.print(array[i] + "; ");
    }
    int max = array[0];
    int min = array[0];
    for (int i = 1; i < array.length; i++) {
      max = Math.max(max, array[i]);
      min = Math.min(min, array[i]);
    }
    System.out.println("\nМаксимальный элемент массива = " + max);
    System.out.println("Минимальный элемент массива = " + min);
    int maxModule = Math.max(Math.abs(max), Math.abs(min));
    System.out.println("Наибольшее по модулю число = " + maxModule);
  }
}
