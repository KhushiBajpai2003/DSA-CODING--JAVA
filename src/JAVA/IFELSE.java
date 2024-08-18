package JAVA;
import java.util.*;
public class IFELSE {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You are Eligible to vote");
        }
        else{
            System.out.println("Not Eligible");
        }


    }
}
