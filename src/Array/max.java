package Array;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        int a[] = new int[4];int max=0;
        int sum = 0;
        Scanner r = new Scanner(System.in);

        System.out.println("enter  an array length");

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
        }
        max=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);


    }
}
