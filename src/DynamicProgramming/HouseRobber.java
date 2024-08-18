package DynamicProgramming;

public class HouseRobber {
    public int rob(int[] nums) {
        return robRecursive(nums, nums.length - 1);
    }

    private int robRecursive(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }

        return Math.max(robRecursive(nums, i - 2) + nums[i], robRecursive(nums, i - 1));
    }

    public static void main(String[] args) {
        HouseRobber robber = new HouseRobber();
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {2, 7, 9, 3, 1};

        System.out.println(robber.rob(nums1));
        System.out.println(robber.rob(nums2));
    }
}

//class Solution {
//    public int rob(int[] nums) {
//        Integer dp[ ] = new Integer[nums.length+10];
//        return  choriKaro_Rec(nums , 0,dp);
//
//    }
//    public int choriKaro_Rec(int[] nums,int idx){
//        if(idx>=nums.length){
//            return 0;
//        }
//
//        int sp1=nums[idx]+choriKaro_Rec(nums,idx+2);
//        int sp2=choriKaro_Rec(nums,idx+1);
//        return Math.max(sp1,sp2);
//
//    }
//    public int choriKaro_Rec(int[] nums,int idx,Integer[] dp){
//        if(idx>=nums.length){
//            return 0;
//        }
//        if(dp[idx]!=null){
//            return dp[idx];
//        }
//
//        int sp1=nums[idx]+choriKaro_Rec(nums,idx+2,dp);
//        int sp2=choriKaro_Rec(nums,idx+1,dp);
//        dp[idx]=Math.max(sp1,sp2);
//        return dp[idx];
//
//    }
//}

