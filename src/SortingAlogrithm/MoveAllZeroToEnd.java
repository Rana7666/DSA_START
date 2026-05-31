package SortingAlogrithm;

public class MoveAllZeroToEnd {
    public static void main(String[] args){}
        void pushZerosToEnd(int[] arr) {
            int j = 0;

            for(int i = 0; i < arr.length; i++){
                if(arr[i] != 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
        }
    }

