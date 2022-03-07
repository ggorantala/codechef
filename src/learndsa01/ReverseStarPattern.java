package learndsa01;

import java.util.Scanner;

class ReverseStarPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = n - 1;

    for(int i = 0; i < n; i++){
      for(int j = 0; j < m; j++){
        System.out.print(" ");
      }

      for(int k = m ; k < n; k++){
        System.out.print("*");
      }
      m--;
      System.out.println();
    }


    sc.close();
  }
}
