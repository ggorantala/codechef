import java.util.Scanner;

class FactorialTravellingSalesMan {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int t = input.nextInt();

      while (t-- > 0) {
         long number = input.nextLong();

         int zeros = 0;
         int count = 5;
         while (number / count > 0) {
            zeros += number / count;
            count *= 5;
         }
         System.out.println(zeros);
      }
      input.close();
   }
}
