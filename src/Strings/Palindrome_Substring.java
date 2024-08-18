package Strings;

public class Palindrome_Substring {
    public static void countPalin(String str){
        int ans=0;
        for(int i =0;i<str.length();i++){
            ans = ans + grow(str,i,i);
            ans = ans + grow(str,i,i+1);
        }
        System.out.println(ans);
    }
    public static int grow(String str,int left,int right){
        int count = 0;
        while(left>=0 && right<str.length()){
            if(str.charAt(left)==str.charAt(right)){
                count++;
                left--;
                right++;
            }
            else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args){
//        Substrings("aaa"); - more complexity
        countPalin("aaa");
    }

}

//class Solution {
//    public int countSubstrings(String s) {
//        int n = s.length();
//        boolean[][] dp = new boolean[n][n];
//        int count = 0;
//
//        for (int i = 0; i < n; i++) {
//            dp[i][i] = true;
//            count++;
//        }
//
//        for (int i = 0; i < n - 1; i++) {
//            if (s.charAt(i) == s.charAt(i + 1)) {
//                dp[i][i + 1] = true;
//                count++;
//            }
//        }
//
//        for (int len = 3; len <= n; len++) {
//            for (int i = 0; i <= n - len; i++) {
//                int j = i + len - 1;
//                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
//                    dp[i][j] = true;
//                    count++;
//                }
//            }
//        }
//
//        return count;
//
//    }
//}