package com.company;

import java.util.Scanner;

public class Task10 {

  public static void main(String[] args) {

    int lines;
    int columns;

    Scanner in = new Scanner(System.in);
    System.out.print("Введите размерность матрицы. Количество строк: ");
    lines = in.nextInt();
    System.out.print("Количество столбцов: ");
    columns = in.nextInt();
    double[][] numbers = new double[lines][columns];

    for (int i = 0; i < lines; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.printf("Координаты элемента: [%d][%d]. Введите значение элемента:", i, j);
        numbers[i][j] = in.nextDouble();
      }
    }
    for (int i = 0; i < lines; i++) {
      System.out.printf("Элемент [0][%d] * 3 = %.2f\n", i, numbers[0][i] * 3);
    }
  }
}