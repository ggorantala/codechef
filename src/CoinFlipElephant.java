import java.util.Scanner;

class CoinFlipElephant {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int t = input.nextInt();
    while (t-- > 0) {
      int G = input.nextInt();
      
      while (G-- > 0) {
        int I = input.nextInt();
        int N = input.nextInt();
        int Q = input.nextInt();

        if (N % 2 == 0) {
          System.out.println(N / 2);
        } else {
          if (I == Q) {
            System.out.println(N / 2);
          } else {
            System.out.println((N / 2) + 1);
          }
        }
      }
    }
    input.close();
  }
}
