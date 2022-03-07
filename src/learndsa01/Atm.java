package learndsa01;// Click on the SUBMIT button to make a submission to this problem.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Atm {
  public static void main(String[] args) throws Exception {
    InputStreamReader i = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(i);
    String[] in = bf.readLine().split(" ");
    float n = Float.parseFloat(in[0]);
    float f = Float.parseFloat(in[1]);

    if (n % 5 == 0 && f >= n + 0.5f)
      System.out.println(f - n - 0.5f);

    else {
      System.out.println(f);
    }
  }
}

