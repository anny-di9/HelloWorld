package com.company;

import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {

    int num1;
    int num2;
    int operation;
    char op;

    Scanner calc = new Scanner(System.in);
    System.out.print("Введите два числа через пробел без запятых : ");
    num1 = calc.nextInt();
    num2 = calc.nextInt();
    System.out.printf("Выберите и напишите нужный символ ( +, -, *, / ): ");
    op = calc.next().charAt(0);
    switch (op) {
      case '+':
        operation = num1 + num2;
        break;
      case '-':
        operation = num1 - num2;
        break;
      case '*':
        operation = num1 * num2;
        break;
      case '/':
        operation = num1 / num2;
        break;
      default:
        System.out.println("Ошибка! Введите два числа еще раз");
        return;
    }
    System.out.println("Результат : \n" + num1 + " " + op + " " + num2 + " = " + operation);
  }
}
