package learndsa01;

import java.util.Scanner;

class FactorsFinding {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    int[] result = new int[n];
    for (int i = 1, k = 0; i <= n; i++) {
      if (n % i == 0) {
        count += 1;
        result[k++] = i;
      }
    }

    System.out.println(count);
    for (int j : result) {
      if (j != 0) {
        System.out.print(j + " ");
      }
    }
  }
}
