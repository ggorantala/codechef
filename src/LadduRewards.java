import java.util.Scanner;

class LadduRewards {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int T = input.nextInt();

    while (T-- > 0) {
      int noOfActivities = input.nextInt();
      String nationality = input.next();
      int divideBy = nationality.equals("INDIAN") ? 200 : 400;
      int total = 0;

      while (noOfActivities-- > 0) {
        String entry = input.next();

        if ("CONTEST_WON".equals(entry)) {
          int rank = input.nextInt();
          total += 300;
          if (rank <= 20) {
            total += 20 - rank;
          }
        } else if ("TOP_CONTRIBUTOR".equals(entry)) {
          total += 300;
        } else if ("BUG_FOUND".equals(entry)) {
          total += input.nextInt();
        } else if ("CONTEST_HOSTED".equals(entry)) {
          total += 50;
        }
      }
      System.out.println(total / divideBy);
    }
  }
}
