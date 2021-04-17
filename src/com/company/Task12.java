package com.company;

public class Task12 {

  public static void main(String[] args) {

    String s = "I like Java!!!";
    boolean c = s.contains("Java");
    boolean start = s.startsWith("I like");
    boolean end = s.endsWith("!!!");
    System.out.println("Результат проверки : " + c + " " + start + " " + end);

    String result = s.toUpperCase();
    System.out.println("Вывод : " + result);

    String oldString = "Java";
    String newString = oldString.replace('a', 'o');
    System.out.println(oldString + "\n " + newString.substring(0, 4));
  }
}
