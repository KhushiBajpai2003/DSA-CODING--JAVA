package DynamicProgramming;

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        int n = scn.nextInt();
        System.out.println("Distinct ways to climb to the top: " + climbStairs(n));
        scn.close();
    }

    public static int climbStairs(int n) {
        if (n <= 1)
            return n;

        int[] dp = new int[n + 10];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] ;
        }

        return dp[n];
    }
}
