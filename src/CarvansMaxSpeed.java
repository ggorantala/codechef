import java.util.Scanner;

class CarvansMaxSpeed {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int t = input.nextInt();
    while (t-- > 0) {
      int numberOfCars = input.nextInt();
      int[] array = new int[numberOfCars];

      for (int i = 0; i < array.length; i++) {
        array[i] = input.nextInt();
      }

      int min = array[0];
      int count = 0;

      for (int el : array) {
        if (el <= min) {
          count += 1;
        }
        if (el < min) {
          min = el;
        }
      }
      System.out.println(count);
    }
    input.close();
  }
}
