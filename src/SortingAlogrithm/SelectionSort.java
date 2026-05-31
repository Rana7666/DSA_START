package SortingAlogrithm;

public class SelectionSort {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 90, 50, 10, 5, 3, 2};
        int n = arr.length;

        print(arr);

        for (int i = 0; i < n - 1; i++) {
            int min =Integer.MAX_VALUE;
            int mindix=-2;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindix=j;//index store
                }
            }
            //swaping
            int temp=arr[i];
            arr[i]=arr[mindix];
            arr[mindix]=temp;
        }
        System.out.println("after sorting");
        print(arr);
    }
}




