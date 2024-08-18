package Recursion;
import java.util.ArrayList;
public class LetterCombinationOfPhoneNumber {
    public static void letter(int idx, String digits, String path, ArrayList<String> al){

        if(idx==digits.length()){
            //System.out.println(path);
            al.add(path);
            return;
        }

        char ch = digits.charAt(idx);
        String str = stringResptoChar(ch);
        for(int i=0;i<str.length();i++){
            letter(idx+1, digits, path + str.charAt(i), al);
        }
    }
    public static String stringResptoChar(char ch){
        String arr[] = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return arr[ch-'2'];
    }
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<>();
        letter(0, "23", "", al);
        System.out.println(al);
    }
}
