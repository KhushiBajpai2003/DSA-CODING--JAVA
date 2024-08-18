package Strings;
import java.util.*;
public class PasswordCreation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        StringBuilder sb = new StringBuilder("");
        int i=0,j=0;
        while(i<a.length() && j<b.length()){
            sb.append(a.charAt(i));
            sb.append(b.charAt(j));
            i++;
            j++;
        }
        while(i<a.length()){
            sb.append(a.charAt(i));
            i++;
        }
        while(j<b.length()) {
            sb.append(a.charAt(j));
            j++;
        }
        System.out.print(sb.toString());
    }


}
