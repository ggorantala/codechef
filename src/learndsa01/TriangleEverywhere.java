package learndsa01;

import java.util.Scanner;

class TriangleEverywhere {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if ((a + b) > c && (b + c) > a && (a + c) > b) {
      if (a == b && b == c) {
        System.out.println(1);
      } else if (a == b || b == c || a == c) {
        System.out.println(2);
      } else {
        System.out.println(3);
      }
    } else {
      System.out.println(-1);
    }
  }
}
