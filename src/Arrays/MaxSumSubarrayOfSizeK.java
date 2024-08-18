package Arrays;

public class MaxSumSubarrayOfSizeK {
    public static int maxSubarray(int k,int[] arr){
        int sum = 0;
        int max = 0;
        int n =  arr.length;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        max = Math.max(sum, max);
        int i =0;
        int maxSum1=0;
        for(int j =k;j<n;j++){
            sum = sum - arr[i];
            i++;
            sum = sum + arr[j];
            maxSum1 = Math.max(maxSum1,sum);
        }
        return maxSum1;
    }
    public static void main(String[] args) {
        int[] arr = {100,200,300,400};
        int maxSum = maxSubarray(2,arr);
        System.out.println("Maximum subarray sum: " + maxSum);
    }

}
