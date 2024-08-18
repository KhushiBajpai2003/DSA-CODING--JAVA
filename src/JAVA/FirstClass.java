package JAVA;
import java.sql.SQLOutput;
import java.util.*;
public class FirstClass {
    public static void main(String args[]){
//        //output
////        System.out.println("Hello World with Java");
////        System.out.print("*\n**\n***\n****");
//        //variables
//        int a=10;
//        int b=15;
//        System.out.println(a+b);
      Scanner sc = new Scanner(System.in);
//       String name = sc.next(); // next function takes only one token as input
//        String name = sc.nextLine(); // takes more than one tokens as input
//        System.out.println(name);
//        nextInt()
//        nextFloat()
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}
