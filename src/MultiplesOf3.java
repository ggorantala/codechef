import java.util.Scanner;

class MultiplesOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long k = sc.nextLong();
            int d0 = sc.nextInt();
            int d1 = sc.nextInt();
            helper(k, d0, d1);
        }
    }

    public static void helper(long k, int d0, int d1) {
        long sum = d1 + d0;
        if (k >= 3) {
            if (sum % 5 != 0) {
                sum = sum + (sum % 10);
                for (long i = (k - 3) % 4; i > 0; i--) {
                    sum = sum + (sum % 10);
                }
                sum = sum + ((k - 3) / 4) * 20;
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sum % 3 == 0 ? "YES" : "NO");
    }
}
