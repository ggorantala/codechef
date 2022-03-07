package learndsa01;

import java.util.Scanner;

class SumIsEverywhere {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    long oddCount = 0;
    long evenCount = 0;

    int t = n * 2;

    for(int i = 1; i <= t; i++){
      if(i % 2 == 0){
        evenCount += i;
      } else {
        oddCount += i;
      }
    }
    System.out.println(oddCount + " " + evenCount);
  }
}
