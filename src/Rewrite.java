import java.util.Scanner;

class Rewrite {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    while (sc.nextLine() != null) {

      if (n != 42) {
        System.out.println(n);
      } else {
        break;
      }
      n = sc.nextInt();
    }
    sc.close();
  }
}
