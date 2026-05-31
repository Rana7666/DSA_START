package Array;

import java.util.Scanner;

public class twopointer {
    public  static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("enter  an array length");
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
        }
        System.out.println("enter an array");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("print in reverse order");
        for (int i =a.length-1;i>=0;i--) {
            System.out.println(a[i]);
        }

    }
}
