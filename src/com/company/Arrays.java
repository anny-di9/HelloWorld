package com.company;

public class Arrays {

  public static void main(String[] args) {

    int[] array = {1, 2, 3, 4, 5};
    int number = array[0];
    array[0] = array[array.length - 1];
    array[array.length - 1] = number;
    System.out.println(array[0] + array[array.length / 2]);
    for (int i : array) {
      System.out.print(i + " ");
    }
  }
}

