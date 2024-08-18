package Stack;

import java.util.Stack;

public class Pattern132 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,-4,-3};
        boolean t = find132Pattern(nums);
        System.out.println(t);
    }

    private static boolean find132Pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int k = Integer.MIN_VALUE;

        for(int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < k) {
                return true;
            } else {
                while (!stack.isEmpty() && nums[i] > stack.peek()) {
                    k = stack.pop();
                }
            }
            stack.push(nums[i]);
        }

        return false;
    }
}


