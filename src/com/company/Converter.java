package com.company;

import java.util.Scanner;

public class Converter {

  public static void main(String[] args) {


    double inputValue;
    double weight;
    double length;
    double inputLength;
    double typeConvert;

    System.out.print("Введите число (1 - масса или 2 - расстояние) : ");
    Scanner converter = new Scanner(System.in);
    typeConvert = converter.nextDouble();

    if (typeConvert == 1) {
      System.out.println("Выберите единицу измерения 1 - грамм, 2 - килограмм, 3 - центнер, 4 - тонна : ");
      weight = converter.nextDouble();
      System.out.println("Введите число, которое хотите сконвертировать : ");
      inputValue = converter.nextDouble();

      if (weight == 1) {
        double gr = inputValue * 1;
        double kg = inputValue * 0.001;
        double hwt = inputValue * 0.00001;
        double tn = inputValue * 0.000001;
        System.out.println("грамм= " + gr + " килограмм= " + kg + " центнер= " + hwt + " тонна= " + tn);

      } else if (weight == 2) {
        double gr = inputValue * 1000;
        double kg = inputValue * 1;
        double hwt = inputValue / 100;
        double tn = inputValue / 1000;
        System.out.println("грамм= " + gr + " килограмм= " + kg + " центнер= " + hwt + " тонна= " + tn);

      } else if (weight == 3) {
        double gr = inputValue * 100000;
        double kg = inputValue * 100;
        double hwt = inputValue / 1;
        double tn = inputValue / 10;
        System.out.println("грамм= " + gr + " килограмм= " + kg + " центнер= " + hwt + " тонна= " + tn);

      } else if (weight == 4) {
        double gr = inputValue * 1000000;
        double kg = inputValue * 1000;
        double hwt = inputValue * 10;
        double tn = inputValue / 1;
        System.out.println("грамм= " + gr + " килограмм= " + kg + " центнер= " + hwt + " тонна= " + tn);
      }
    } else if (typeConvert == 2) {
      System.out.println("Выберите единицу измерения 1 - метр, 2 - миля, 3 - ярд, 4 - фут : ");
      length = converter.nextDouble();
      System.out.println("Введите число, которое хотите сконвертировать : ");
      inputLength = converter.nextDouble();

      if (length == 1) {
        double m = inputLength * 1;
        double mi = inputLength * 0.0006214;
        double yd = inputLength * 1.094;
        double ft = inputLength * 3.281;
        System.out.println("метр = " + m + " миля = " + mi + " ярд = " + yd + " фут = " + ft);

      } else if (length == 2) {
        double m = inputLength * 1609;
        double mi = inputLength * 1;
        double yd = inputLength * 1760;
        double ft = inputLength * 5280;
        System.out.println("метр = " + m + " миля = " + mi + " ярд = " + yd + " фут = " + ft);

      } else if (length == 3) {
        double m = inputLength * 0.9144;
        double mi = inputLength * 0.0005682;
        double yd = inputLength * 1;
        double ft = inputLength * 3;
        System.out.println("метр = " + m + " миля = " + mi + " ярд = " + yd + " фут = " + ft);

      } else if (length == 4) {
        double m = inputLength * 0.3048;
        double mi = inputLength * 0.0001894;
        double yd = inputLength * 0.3333;
        double ft = inputLength * 1;
        System.out.println("метр = " + m + " миля = " + mi + " ярд = " + yd + " фут = " + ft);
      }
    }
  }
}

