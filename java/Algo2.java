package com.survivalCoding;

import java.util.Scanner;

public class Algo2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 공사현장 좌표 및 소음
    int[] place = new int[3];
    for (int i = 0; i < place.length; i++){
      place[i] = sc.nextInt();
    }
    
    // 나무의 좌표들
    int trees = sc.nextInt();
    int[] xs = new int[trees];
    int[] ys = new int[trees];

    for (int i = 0; i < trees; i++){
      xs[i] = sc.nextInt();
      ys[i] = sc.nextInt();

      System.out.println(deterNoise(place, xs[i], ys[i]));
    }

    sc.close();

  }

  public static String deterNoise (int[] place, int x, int y) {
	  String result = "noisy";
	  if (Math.pow((place[0] - x), 2) + Math.pow((place[1] - y), 2) >= Math.pow(place[2], 2)) {
		  result = "silent";
	  }
    return result;
  }

}
