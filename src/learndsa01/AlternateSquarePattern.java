package learndsa01;

import java.util.Scanner;

class AlternateSquarePattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        for (int j = 5 * i; j >= 5 * i - 4; j--) {
          System.out.print(j + " ");
        }
      } else {
        for (int j = 5 * i - 4; j <= i * 5; j++) {
          System.out.print(j + " ");
        }
      }
      System.out.println();
    }
  }
}
