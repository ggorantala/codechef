package learndsa01;

import java.util.Scanner;

class TraingleWithAngle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.println(a == 0 | b == 0 | c == 0 ? "NO" : a + b + c == 180 ? "YES" : "NO");
    sc.close();
  }
}
