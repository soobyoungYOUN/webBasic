package java;

import java.util.Scanner;

public class Algo1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    resolve(count);

    sc.close();
  }

  public static void resolve(int count) {
    String[] arr = new String[count];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < count; i++){
      arr[i] = sc.next();
    }

    String point = ",";

    System.out.print("Hello");
    for (int i = 0; i < count; i++){
      if (i == count - 1) {
        point =".";
      }
      System.out.print(" " + arr[i] + point);
    }
    sc.close();
  }
}