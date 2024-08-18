package Arrays;
//
//import java.util.HashMap;
//
//public class SubarraySumsEqualsTo_k {
//    public static void subarraySum(int[] nums, int k){
//        int sum = 0;
//        int count = 0;
//        int sub = 0;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put(0,1);
//        for (int i = 0; i<nums.length;i++){
//            sum = sum + nums[i];
//            sub = sum - k;
//
//            if(map.containsKey(sub)){
//                int val = map.get(sub);
//                count = count + val;
//            }
//            if(map.containsKey(sum)){
//                int val = map.get(sum);
//                map.put(sum , val+1);
//            }
//            else{
//                map.put(sum , 1);
//            }
//        }
//        System.out.println(count);
//    }
//
//    public static void main(String[] args){
//        int[] nums = {4,1,5,2};
//        subarraySum(nums,7);
//    }
//}
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubarraySumsEqualsTo_k {
    static int count = 0;
    public static void subarraySum(int[] nums, int k){
        List<Integer> result = new ArrayList<>();
        subarraySumHelper(nums, k, 0, result, 0);
        System.out.println("Total subsequences with sum equal to " + k + ": " + count);
    }

    private static void subarraySumHelper(int[] nums, int k, int index, List<Integer> result, int sum) {
        if (index == nums.length) {
            if (sum == k) {
                count++;
                System.out.println("Subsequence with sum equal to k: " + result);
            }
            return;
        }
        // Include the current element
        result.add(nums[index]);
        subarraySumHelper(nums, k, index + 1, result, sum + nums[index]);
        // Exclude the current element
        result.remove(result.size() - 1);
        subarraySumHelper(nums, k, index + 1, result, sum);
    }

    public static void main(String[] args){
        int[] nums = {4, 1, 5, 2};
        subarraySum(nums, 7);
    }
}
