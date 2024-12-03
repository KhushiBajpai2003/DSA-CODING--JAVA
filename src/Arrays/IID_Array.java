package Arrays;

import java.util.Scanner;

public class IID_Array {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int [row][col];
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col ; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int element = sc.nextInt();

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col ; j++){
               if( arr[i][j]== element){
                   System.out.println("Element found at location ("+i+","+j+")");
               }
               else{
                   System.out.println(" ");
               }
            }
        }
    }
}
