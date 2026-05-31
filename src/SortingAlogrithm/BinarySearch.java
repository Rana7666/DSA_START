package SortingAlogrithm;
import java.util.Arrays;

public class BinarySearch {
    static void main() {
        int k[]={2,3,5,6,7,8,9,10,11,13,15,18};
        int target=5;
        int high=k.length-1;
        int low=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(k[mid]==target){
                System.out.println(" "+mid);
                return;
            }
           else if(k[mid]<target){
                low=mid+1;
            }
           else{
               high=mid-1;
            }
        }
        System.out.println("element not found");
    }
}
