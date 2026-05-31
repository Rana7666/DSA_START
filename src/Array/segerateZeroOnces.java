package Array;

public class segerateZeroOnces {
    static void main() {

    }
    class Solution {

            void segregate0and1 ( int[] arr, int n){
                int i = 0;
                int j = n - 1;

                while (i < j) {
                    // Move i forward if 0
                    if (arr[i] == 0 && i < j) {
                        i++;
                    }

                    // Move j backward if 1
                    if (arr[j] == 1 && i < j) {
                        j--;
                    }

                    // Swap
                    if (i < j) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        i++;
                        j--;
                    }
                }
            }
        }
    }

