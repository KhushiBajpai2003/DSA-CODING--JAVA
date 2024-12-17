package Arrays;

import java.util.Scanner;

public class HSBC_ARRAY {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int N = sc.nextInt();
        int arr2[] = new int[N];
        int arr1[] = new int[N];
        System.out.println("Enter the first array: ");
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the second array");
        for (int i = 0; i < N; i++) {
            arr2[i] = sc.nextInt();
        }
        for(int i=0; i<N;i++){
                sum += arr1[i]*arr2[N-1-i];

            }
        System.out.println("The sum is:"+sum);
        }


    }

