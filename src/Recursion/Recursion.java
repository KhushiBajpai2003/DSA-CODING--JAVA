package Recursion;

public class Recursion {
    public static void reverseNumbers(int start,int end){
        if(start>end){
            return;
        }
        System.out.println(start);
        reverseNumbers(start+1,end);
        System.out.println(start);
    }

    public static void main(String[] args){
        reverseNumbers(1,5);
    }


}
