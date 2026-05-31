package SortingAlogrithm;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        int i[] = {1, 2, 3, 10, 4};
        int j[] = {1, 3, 5, 6,};

        Arrays.sort(i); // important
        Arrays.sort(j);

        int a = 0, b = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (a < i.length && b < j.length) {
            if (i[a] == j[b]) {
                ans.add(i[a]);
                a++;
                b++;
            } else if (i[a] < j[b]) {
                a++;
            } else {
                b++;
            }
        }

        System.out.println(ans);
    }
}