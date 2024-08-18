package DynamicProgramming;

import java.util.Scanner;

public class Fibbo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scn.nextInt();
        Integer dp[] = new Integer[n+10];
        int ans = Memo(n,dp);
        System.out.println(Memo(n,dp));
    }
    public static int Memo(int n , Integer dp[]){
        if(n<=1){
            return n;
        }
        if(dp[n]!=null){
            return dp[n];
        }
        int a = Memo(n-2,dp);
        int b = Memo(n-1,dp);
        dp[n]= a + b;
        return dp[n];
    }

}
