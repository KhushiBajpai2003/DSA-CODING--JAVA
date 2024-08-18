package DynamicProgramming;
import java.util.Scanner;
public class ClimbStairsWithVariableJumps {
    public static int countWays(int[] steps) {
        int n = steps.length;
        int[] dp = new int[n + 1];
        dp[n] = 1;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= steps[i]; j++) {
                if (i + j <= n) {
                    dp[i] += dp[i + j];
                }
            }
        }

        return dp[0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of nodes: ");
        int totalNodes = scanner.nextInt();

        int[] steps = new int[totalNodes];
        System.out.println("Enter the number of steps for each node:");
        for (int i = 0; i < totalNodes; i++) {
            System.out.print("Node " + i + ": ");
            steps[i] = scanner.nextInt();
        }

        System.out.println("Number of ways: " + countWays(steps));
        scanner.close();
    }
}