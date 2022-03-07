package learndsa01;

import java.util.Scanner;

class RangeOld {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);

    int L = sc.nextInt();
    int R = sc.nextInt();
    int[] result = new int[R];
    int k = 0;

    while (L <= R) {
      if (L % 2 == 1) {
        result[k++] = L;
      }
      L++;
    }

    for (int j : result) {
      if (j != 0) {
        System.out.print(j + " ");
      }
    }
  }
}
