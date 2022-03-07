import java.util.Arrays;
import java.util.Scanner;

class Lapindromes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while (t-- > 0) {
      String input = sc.next();
      isLapindrome(input);
    }

    sc.close();
  }

  public static void isLapindrome(String s) {
    int n = s.length();
    String s1 = s.substring(0, n / 2);
    String s2 = n % 2 == 0 ? s.substring(n / 2, n) : s.substring((n / 2) + 1, n);
    char[] chars1 = s1.toCharArray();
    char[] chars2 = s2.toCharArray();
    Arrays.sort(chars1);
    Arrays.sort(chars2);

    int count = 0;
    for (int i = 0; i < chars1.length; i++) {
      if (chars1[i] != chars2[i]) {
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");
  }
}
