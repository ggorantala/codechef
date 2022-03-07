import java.util.Scanner;

class ReverseTheNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    long[] array = new long[t];

    int i = 0;
    while (t-- > 0) {
      long number = sc.nextLong();
      array[i++] = number;
    }

    for (long el : array) {

      long revValue = reverse(el);
      System.out.println(revValue);
    }
    sc.close();
  }

  public static long reverse(long number) {
    long output = 0;
    while (number != 0) {
      long rem = number % 10;
      output = output * 10 + rem;
      number /= 10;
    }
    return output;
  }
}
