package JAVA;
import java.util.*;
public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrimeNumber(num);
    }

    public static void PrimeNumber(int num){
        if(num<=1){
            System.out.println("Number is not prime");
        }
        for(int i=2; i<Math.sqrt(num);i++) {
            if (num % i == 0) {
                System.out.println("Number is not prime");
                return;
            }
        }
        System.out.println("Number is prime");
    }
}
