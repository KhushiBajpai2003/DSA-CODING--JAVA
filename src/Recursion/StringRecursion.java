package Recursion;

public class StringRecursion {
    public static void Stringprint(int index,String str,String given){
        if(index>=given.length()){
            System.out.println(str);
            return;
        }
        Stringprint( index+1, str+given.charAt(index) , given);
        Stringprint(index+1,str,given);
    }


    public static void main(String[] args){
        Stringprint(0,"","abc");

    }
}
