package Strings;
import java.util.*;
public class StringChecker {
   public static void main(String[] args){
       StringBuilder sb = new StringBuilder("abaacbac");
       for(int i=0;i<sb.length()-1;i++){
           if(sb.charAt(i)=='c'&& sb.charAt(i+1)=='b'){
               sb.setCharAt(i,'b');
               sb.setCharAt(i+1,'c');
       } else if (sb.charAt(i)=='b'&& sb.charAt(i+1)=='a') {
               sb.setCharAt(i,'a');
               sb.setCharAt(i+1,'b');
           }
       }
       System.out.print(sb);
   }
}
