package learndsa01;/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class IsBoth {
  public static void main(String[] args) throws java.lang.Exception {
    // your code goes here
    Scanner input = new Scanner(System.in);
    int x;
    x = input.nextInt();
    if (x % 5 == 0 & x % 11 == 0)
      System.out.println("BOTH");
    else if (x % 5 == 0 | x % 11 == 0)
      System.out.println("ONE");
    else
      System.out.println("NONE");
  }
}
