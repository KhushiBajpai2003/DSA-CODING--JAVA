package Arrays;

public class FindLargest {
    public static void main(String args[]){
        int arr[] = new int[]{1,4,6,7,8,9};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("Largest element in the array:"+max);

    }
}
