package DynamicProgramming;

public class Goldmines {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 3;
        int[][] matrix = {
                {1, 2, 8},
                {2, 1, 9},
                {3, 3, 2},
                {4, 5, 1}
        };
        int[] dp = new int[rows];
        for (int i = 0; i < rows; i++) {
            dp[i] = matrix[i][cols - 1];
        }
        for (int j = cols - 2; j >= 0; j--) {
            int[] tempDp = new int[rows];
            for (int i = 0; i < rows; i++) {
                int maxGold = dp[i];
                if (i > 0)
                    maxGold = Math.max(maxGold, dp[i - 1]);
                if (i < rows - 1)
                    maxGold = Math.max(maxGold, dp[i + 1]);
                tempDp[i] = maxGold + matrix[i][j];
            }
            dp = tempDp;
        }
        int maxGold = dp[0];
        for (int i = 1; i < rows; i++) {
            maxGold = Math.max(maxGold, dp[i]);
        }

        System.out.println("Maximum gold that can be collected: " + maxGold);
    }
}
