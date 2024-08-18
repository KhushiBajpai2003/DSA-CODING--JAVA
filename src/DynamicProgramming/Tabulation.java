package DynamicProgramming;

import java.util.Scanner;

public class Tabulation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scn.nextInt();
        Integer dp[] = new Integer[n + 10];             // (n+1)
        int ans = BUTabu(n, dp);
        System.out.println(ans);
    }

    public static int BUTabu(int n, Integer dp[]) {
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int a = dp[i - 1];
            int b = dp[i - 2];
            dp[i] = a + b;

        }
        return dp[n];
    }
}
