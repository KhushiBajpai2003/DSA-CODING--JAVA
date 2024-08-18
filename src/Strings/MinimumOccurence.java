package Strings;

import java.util.HashMap;

public class MinimumOccurence {
    public static Character occurence(String s){
        int index = -1;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
                int value = map.get(s.charAt(i));
                map.replace(s.charAt(i),value+1);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) < min) {
                min = map.get(c);
                index = i;
            }
        }

        return s.charAt(index);
    }

    public static void main(String[] args) {
        System.out.println(occurence("cdadcda"));
    }
}

