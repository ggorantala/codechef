package learndsa01;

import java.util.Scanner;

class AddNaturalNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    long total = 0;
    for (int i = 1; i <= N; i++) {
      total += i;
    }
    System.out.println(total);
  }
}
