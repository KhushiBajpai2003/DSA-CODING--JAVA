package Recursion;

public class JumpingStep {
    public static void JumpingStep(int n, String str ){
        if(n<0){
            return;
        }
        if(n==0){
            System.out.println(str);
            return;
        }
        JumpingStep(n-1, str +1);
        JumpingStep(n-2, str +2);
        JumpingStep(n-3, str +3);
    }
    public static void main(String[] args){
        JumpingStep(4,"");
    }

}
