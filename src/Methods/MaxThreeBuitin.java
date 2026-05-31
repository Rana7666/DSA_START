package Methods;

import java.util.Scanner;

public class MaxThreeBuitin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter column ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int max =Math.max(Math.max(a,b),Math.max(c,d));
        System.out.println("max of four number :  "+max);

    }
}
