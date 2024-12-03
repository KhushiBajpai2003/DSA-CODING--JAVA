package Arrays;

import java.util.Scanner;

public class Search_Element {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int element = sc.nextInt();
        for(int i = 0; i<size; i++){
            if(arr[i]== element){
                System.out.println("element found at index :"+i);
            }
        }

    }

}
