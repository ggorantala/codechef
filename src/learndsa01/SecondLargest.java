package learndsa01;

import java.util.Scanner;

class SecondLargest {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.println(
      a > b && a > c ? Math.max(b, c)
        : b > a && b > c ? Math.max(a, c) : Math.max(a, b));
  }
}
