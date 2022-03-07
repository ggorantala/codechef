package learndsa01;

import java.util.Scanner;

class ReverseMe {
  public static void main(String[] args) throws java.lang.Exception{
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    int[] array = new int[T];

    int i = 0;
    while(T-- > 0){
      array[i++] = sc.nextInt();
    }

    int l = 0, r = array.length - 1;

    while(l < r){
      int temp = array[l];
      array[l++] = array[r];
      array[r--] = temp;
    }
    for(int el: array){
      System.out.print(el +" ");
    }
  }
}
