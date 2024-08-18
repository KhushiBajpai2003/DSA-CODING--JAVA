package Strings;
import java.util.*;
public class IntegerToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String s = Integer.toString(n);
        if(s.equals(Integer.toString(n))){
            System.out.println("Good job");
        }else{
            System.out.println("Wrong answer");
        }


    }
}
