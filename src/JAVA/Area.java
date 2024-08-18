package JAVA;
import java.util.*;
public class Area {


    public static void Area(int B, int H) {
        int Area = 1;
        Area = B * H;
        System.out.print("Area of parallelogram is:" + Area);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();
        if (B <= 0 || H <= 0) {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        } else {
            Area(B, H);
        }
    }
}

