package com.company;

import java.util.Scanner;

public class FinalTask4 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int count = 1;

    System.out.println("Попробуй отгадать загадку:\n" +
        "“Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”\n" +
        "Для подсказки введи: Подсказка");

    String answer = "Заархивированный вирус";
    String userAnswer;

    while (count <= 3) {
      System.out.printf("Попытка №%d: ", count);
      userAnswer = sc.nextLine();
      if (answer.equalsIgnoreCase(userAnswer)) {
        System.out.println("Правильно!");
        break;
      } else if (userAnswer.equalsIgnoreCase("Подсказка") && count == 1) {
        System.out.println("Какой-то там вирус");
      } else if (userAnswer.equalsIgnoreCase("Подсказка") && count > 1) {
        System.out.println("Подсказка уже недоступна");
      } else if (count < 3) {
        count++;
        System.out.println("Подумай ещё!");
      } else {
        count++;
        System.out.println("Обидно, приходи в другой раз!");
      }
    }
  }
}



