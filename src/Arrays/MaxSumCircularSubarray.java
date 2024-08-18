package Arrays;

public class MaxSumCircularSubarray {
    public static int maxSubarray(int arr[]) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int j = 0; j < arr.length; j++) {
            sum += arr[j];

            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static int max_mid_Subarray(int arr[]) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int negSum = 0;

        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 0) {
                negSum += arr[j];
            } else {
                sum += arr[j];

                max = Math.max(max, sum);

                if (sum < 0) {
                    sum = 0;
                }
            }
        }

        if (sum == 0) {
            return negSum;
        }

        return totalSum - max;
    }


    public static void main(String[] args) {
//        int[] arr = {3, -1, 5, -100, 4, 2};
        int[] arr = {-3,-2,-3};
        int maxSum1 = maxSubarray(arr); // Maximum subarray sum without circular wrapping
        int maxSum2 = max_mid_Subarray(arr); // Maximum subarray sum considering circular wrapping

        // Output the maximum of the two sums
        System.out.println("Maximum subarray sum: " + Math.max(maxSum1, maxSum2));
    }
}


