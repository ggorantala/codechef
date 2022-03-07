import java.util.Arrays;
import java.util.Scanner;

class MaximiseEarnings {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    long[] input = new long[t];

    int i = 0;
    while (t-- > 0) {
      input[i++] = sc.nextLong();
    }

    Arrays.sort(input);

    long maxEarnings = Integer.MIN_VALUE;
    for (int j = 0; j < input.length; j++) {
      maxEarnings = Math.max(input[j] * (input.length - j), maxEarnings);
    }
    System.out.println(maxEarnings);
  }
}
