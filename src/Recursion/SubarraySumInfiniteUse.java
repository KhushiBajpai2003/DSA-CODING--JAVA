package Recursion;

public class SubarraySumInfiniteUse {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 5};
        int k = 7;
        System.out.println(countSubarraysWithSumInfiniteUse(nums, k));
    }
    public static int countSubarraysWithSumInfiniteUse(int[] nums, int k) {
        return countSubarraysWithSumInfiniteUseIndex(nums, k, 0);
    }
    private static int countSubarraysWithSumInfiniteUseIndex(int[] nums, int remaining, int startIndex) {
        if (remaining == 0) {
            return 1;
        }
        if (remaining < 0) {
            return 0;
        }
        int count = 0;
        for (int i = startIndex; i < nums.length; i++) {
            count += countSubarraysWithSumInfiniteUseIndex(nums, remaining - nums[i], i);
        }
        return count;
    }
}
