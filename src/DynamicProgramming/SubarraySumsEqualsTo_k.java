package DynamicProgramming;

//public class SubarraySumsEqualsTo_k {
//    public static int subarraySum(int[] nums, int k){
//        int n = nums.length;
//        int[][] dp = new int[n + 1][k + 1];
//        for (int i = 0; i <= n; i++) {
//            dp[i][0] = 1;
//        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= k; j++) {
//                if (nums[i - 1] <= j) {
//                    dp[i][j] = dp[i - 1][j - nums[i - 1]];
//                }
//                dp[i][j] += dp[i - 1][j];
//            }
//        }
//
//        return dp[n][k];
//    }
//
//    public static void main(String[] args){
//        int[] nums = {4, 1, 5, 2};
//        int k = 7;
//        int count = subarraySum(nums, k);
//        System.out.println("Total subsequences with sum equal to " + k + ": " + count);
//    }
//}

public class SubarraySumsEqualsTo_k {
    public static boolean subarraySum(int[] nums, int k){
        int n = nums.length;
        boolean[][] dp = new boolean[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][k];
    }

    public static void main(String[] args){
        int[] nums = {4, 1, 5, 2};
        int k = 7;
        boolean isPossible = subarraySum(nums, k);
        System.out.println("Is it possible to form a subarray with sum equal to " + k + ": " + isPossible);
    }
}

