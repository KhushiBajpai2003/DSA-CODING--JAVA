package Recursion;

public class SubarraySumEqualsTo_k {

        public static void main(String[] args) {
            int[] nums = {1, 1, 1};
            int k = 2;
            System.out.println(countSubarraysWithSum(nums, k)); // Output: 2
        }

        public static int countSubarraysWithSum(int[] nums, int k) {
            return countSubarraysWithSumHelper(nums, k, 0);
        }

        private static int countSubarraysWithSumHelper(int[] nums, int k, int startIndex) {
            if (startIndex >= nums.length) {
                return 0;
            }

            int count = 0;
            int sum = 0;

            for (int i = startIndex; i < nums.length; i++) {
                sum += nums[i];
                if (sum == k) {
                    count++;
                }
            }

            // Recurse by moving the startIndex to the next position
            count += countSubarraysWithSumHelper(nums, k, startIndex + 1);

            return count;
        }
    }


