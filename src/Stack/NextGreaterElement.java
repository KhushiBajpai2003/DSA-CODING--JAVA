package Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] arr = new int[nums1.length];
        greater(nums2, hmap, s);
        for(int i=0; i<nums1.length; i++){
            if(hmap.containsKey(nums1[i])){
                nums1[i] = hmap.get(nums1[i]);
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void greater(int[] nums2, HashMap<Integer, Integer> hmap, Stack<Integer> s){
        for(int i=0; i<nums2.length; i++){
            while(!s.isEmpty() && nums2[s.peek()] < nums2[i]){
                hmap.put(nums2[s.pop()], nums2[i]);
            }
            s.add(i);
        }

        while(!s.isEmpty()){
            hmap.put(nums2[s.pop()],-1);
        }
    }
}

