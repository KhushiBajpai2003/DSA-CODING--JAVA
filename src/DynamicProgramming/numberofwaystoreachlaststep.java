package DynamicProgramming;
import java.util.Scanner;

public class numberofwaystoreachlaststep {

    public static int countWays(int n) {
        int[] dp = new int[n + 1];
        dp[n] = 1;

        for (int i = n - 1; i >= 0; i--) {
            int temp = 0;
            if(i+1<=n){
                temp+=dp[i+1];
            }
            if(i+2<=n){
                temp+=dp[i+2];
            }
            if(i+3<=n){
                temp+=dp[i+3];
            }

                    dp[i] = temp;
                }



        return dp[0];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        int n = scn.nextInt();
        System.out.println("ways to climb to the top: " + countWays(n));
        scn.close();
    }
}
