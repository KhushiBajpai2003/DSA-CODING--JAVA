package Recursion;

public class ArrayRecursion {
    public static void ArrayRecursion(int n, int arr[], String str, int index){

        if(n==0){
            System.out.println(str);
            return;
        }
        if(n<0){
            return;
        }
        for(int i = index; i<arr.length; i++){
            ArrayRecursion(n-arr[i],arr, str+arr[i],i);
        }

    }
    public static void main(String[] args){
        int arr[] = {1,2,3};
        int index = 0;
        ArrayRecursion(5,arr,"",index);

    }
}
