package Stack;
import java.util.Stack;
public class ValidParenthesis {
    public static int Parenthesis(String str, Stack<Character>st){
        int count = 0;
        for(int i=0 ; i<str.length(); i++){
            if(str.charAt(i)=='('){
                st.add(str.charAt(i));
            }
            else if(!st.isEmpty() &&str.charAt(i)==')'){
               count++;
               st.pop();
            }
        }
        return count;
    }
    public static void main(String[] args){
        Stack<Character> st = new Stack<>();
        String str= "()((()))(((((";
        int result=Parenthesis(str,st);
        System.out.println(result);
    }
}
