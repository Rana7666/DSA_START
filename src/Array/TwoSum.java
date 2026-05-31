package Array;

public class TwoSum {
    public static boolean main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int n = arr.length-1;
        int i = 0;
        int target = 40;
        while(i<n)
        if (arr[i] + arr[n] == target) {
            return true;
        } else if (arr[i] + arr[n] > target) {
            n--;
        } else if (arr[i] + arr[n] < target) {
            i++;

        }
        return false;
    }
}

