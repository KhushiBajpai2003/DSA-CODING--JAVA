package Strings;
import java.util.*;
public class IronMagnet {
        public static int magnet(String s){
            int count = 0;
            int N =0;
            int S = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='N'){
                    N++;
                }
            }
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='S'){
                    S++;
                }
            }
            if(s.charAt(0)=='S'){
                N++;
                count++;

            }
            if(s.charAt(s.length()-1)=='N'){
                S++;
                count++;
            }


            if(N!=S){
                count = count + (Math.abs(N-S));
            }
            return count;

        }

        public static void main(String[] args) {
            System.out.println(magnet("SNNSN"));
        }
    }



