package Arrays;
import java.util.Scanner;
public class TargetElement {
    public static void main(String args[]){
        int [] arr = {1,5,8,9,10,3};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        TargetElement(arr,target);
        }

    public static void TargetElement(int [] arr, int target){
        for(int i =0; i<arr.length; i++){
            if(arr[i]== target){
               System.out.println("Target element found at index:"+i);
               return;
            }
        }
        System.out.println("Target element not found");
    }
}
