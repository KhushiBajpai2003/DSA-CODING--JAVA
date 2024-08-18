package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int Fibonacci(int n ){
        if(n<=1){
            return n;
        }
        int a = Fibonacci(n-2);
        int b = Fibonacci(n-1);
        return a + b;

    }
  public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter the number");
      int m = scn.nextInt();
      System.out.println(Fibonacci(m));
  }
}
