package SortingAlogrithm;

public class BubbleSort {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[]={10,20,30,90,50,10,5,3,2};
        int n=arr.length;

        print(arr);

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        print(arr);


        // printing the sorted array in the reverse order
        for(int j=arr.length-1;j>=0;j--){
            System.out.println(arr[j]+" ");
        }
        System.out.println( );
    }
}