//package Recursion;
//
//public class necheseupar {
//    public static void JumpingStep(int top,int n, String str ){
//        if(n>top){
//            return;
//        }
//        if(n==top){
//            System.out.println(str);
//            return;
//        }
//        JumpingStep(top,n+1, str +1);
//        JumpingStep(top,n+2, str +2);
//        JumpingStep(top,n+3, str +3);
//    }
//    public static void main(String[] args){
//
//        JumpingStep(6,0,"");
//    }
//
//}
package Recursion;

public class necheseupar {

    static String[] generatedStrings;
    static int index = 0;

    public static void JumpingStep(int top, int n, String str) {
        if (n > top) {
            return;
        }
        if (n == top) {
            generatedStrings[index++] = str;
            return;
        }
        JumpingStep(top, n + 1, str + "1");
        JumpingStep(top, n + 2, str + "2");
        JumpingStep(top, n + 3, str + "3");
    }

    public static void main(String[] args) {
        generatedStrings = new String[100]; // Initialize array with a size, adjust as needed
        JumpingStep(4, 0, "");

        System.out.println("Generated strings: ");
        for (int i = 0; i < index; i++) {
            System.out.println(generatedStrings[i]);
        }

        System.out.println("count of Strings: " + index);
    }
}

