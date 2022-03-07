package learndsa01;

import java.util.Scanner;

class RajuAndHisTrip {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);

    int busNumber = sc.nextInt();

    if (busNumber % 5 == 0 | busNumber % 6 == 0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    sc.close();
  }
}
