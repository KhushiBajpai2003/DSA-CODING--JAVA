package Recursion;

public class AsciiRecursion {
    public static void Asciiprint(String given,String str,int index){
        if(index>=given.length()){
            System.out.println(str);
            return;
        }
        Asciiprint( given, str+given.charAt(index) , index+1);
        Asciiprint(given,str,index+1);
        Asciiprint( given, str+(int)given.charAt(index) , index+1);

    }
    public static void main(String[] args){
        Asciiprint("abc","",0);
    }
}
