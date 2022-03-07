package learndsa01;

import java.util.Scanner;

class FindMe {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    int target = sc.nextInt();

    int[] array = new int[t];

    int i = 0;

    while (t-- > 0) {
      array[i++] = sc.nextInt();
    }
    int j = 0;
    for (; j < array.length; j++) {
      if (array[j] == target) {
        System.out.println(1);
        return;
      }
    }
    if (j == array.length) {
      System.out.println(-1);
    }
    sc.close();
  }
}
