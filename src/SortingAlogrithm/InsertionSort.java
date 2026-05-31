package SortingAlogrithm;

public class InsertionSort {
    static void main() {
        int[] arr={10,8,9,8,78,89,586};
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]>arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for(int ele : arr) System.out.println(ele);

    }
}
