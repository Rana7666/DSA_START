package Array;

import java.util.Vector;
import java.util.Collections;

public class Addingone {

    public static void main(String[] args) {

        int[] arr = {9, 9, 9};   // input array

        Vector<Integer> ans = new Vector<>();
        int n = arr.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {

            if (arr[i] + carry <= 9) {
                ans.add(arr[i] + carry);
                carry = 0;
            } else {
                ans.add(0);
                carry = 1;
            }
        }

        // handle leftover carry
        if (carry == 1) {
            ans.add(1);
        }

        // reverse because you added from last
        Collections.reverse(ans);

        System.out.println(ans);
    }
}